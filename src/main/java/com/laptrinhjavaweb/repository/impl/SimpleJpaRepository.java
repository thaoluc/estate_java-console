package com.laptrinhjavaweb.repository.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;
import com.laptrinhjavaweb.mapper.ResultSetMapper;
import com.laptrinhjavaweb.repository.JpaRepository;

public class SimpleJpaRepository<T> implements JpaRepository<T> {

	private Class<T> zClass;
	
	@SuppressWarnings("unchecked")
	public SimpleJpaRepository() {
		//đi vào mảng SimpleJpaRepository<T> get T (phần tử thứ 0)
		//get class của object T (buildingEntity,userEntity)
		Type type  = getClass().getGenericSuperclass();
		ParameterizedType parameterizedType = (ParameterizedType) type;
		zClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}
	@Override
	public List<T> findAll() {
		
		String tableName = "";
		
		//kiểm tra zClass là Entity và có annotation là Table hay k ?
		if(zClass.isAnnotationPresent(Entity.class) && zClass.isAnnotationPresent(Table.class)) {
			Table table = zClass.getAnnotation(Table.class); //truy cập annotation Table
			tableName = table.name();	//get tên table
		}
		String sql = "Select * from "+tableName+"";
		
		//List<T> results = new ArrayList<>();
		
		ResultSetMapper<T> resultSetMapper = new ResultSetMapper<>();
		Connection connection = null;
		PreparedStatement statement = null;	//PreparedStatement: de tham so trong query, support method thuc thi query
		ResultSet resultSet = null;
		
		try {
			connection = EntityManagerFactory.getConnection();
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			
			return resultSetMapper.mapRow(resultSet, this.zClass); 
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
		
	}
	
}
