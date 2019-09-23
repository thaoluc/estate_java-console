package com.laptrinhjavaweb.mapper;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;

//làm việc vs ResultSet maching data dựa theo tên field
//convert data từ ResultSet sang đối tượng
public class ResultSetMapper<T> {
	public List<T> mapRow(ResultSet rs, Class<T> zClass){
		List<T> results = new ArrayList<>();
		try {
			if(zClass.isAnnotationPresent(Entity.class)) {
				
				ResultSetMetaData rsmd=rs.getMetaData(); //ResultSetMetaData: get name và value of từng field
				Field[] allFields = zClass.getDeclaredFields(); //all fields of class of entity
				
				while(rs.next()) {	//đi từng row (trong resultset)
					T object = zClass.newInstance();
					
					for(int i=0; i<rsmd.getColumnCount(); i++) {	//đi từng column (trong resultset)
						String columnName = rsmd.getColumnName(i+1);	//get name column trong resultset
						//get value 
						//dùng Object do có nhiều kdl khác nhau
						Object columnValue = rs.getObject(i+1);
						
						//loop field trong entity's class
						for(Field field:allFields) {
							if(field.isAnnotationPresent(Column.class)) {	//field là column ??
								//truy cập annotation Column
								Column column = field.getAnnotation(Column.class);
								
								//matching column entity vs resultset
								if(column.name().equals(columnName) && columnValue != null) {
									//convert data
									BeanUtils.setProperty(object, field.getName(), columnValue);
									break;
								}
							}
						}
					}
					results.add(object);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return results;
	}
}
