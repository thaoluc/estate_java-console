package com.laptrinhjavaweb.repository.impl;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository  {

	/*
	@Override
	public List<BuildingEntity> findAll(Map<String, Object> params, Pageable pageable) {
		/*
//		String name = (String) params.get("name");
//		String district = (String) params.get("district");
	
		
		StringBuilder where = new StringBuilder(" ");
		
		 Student code .-. '.' "." =o=
		 
		if(StringUtils.isNotBlank(name)) {
			where.append("AND A.name LIKE '%"+name+"%' ");
		}
		if(StringUtils.isNotBlank(district)) {
			where.append("AND A.name LIKE '%"+district+"%' ");
		}
		if(params.get("buildingarea") != null) {
			Integer buildingArea =  (Integer) params.get("buildingArea");
			where.append("AND A.buildingarea = " + buildingArea + " ");
		}
		if(params.get("numberofbasement") != null) {
			Integer numberOfBasement =  (Integer) params.get("numberOfBasement");
			where.append("AND A.numberofbasement = "+numberOfBasement+" "); 
		}
		
		
		//experience O.O .O.
		if(params != null && params.size() > 0) {
			String [] keys = new String [params.size()];
			Object [] values = new Object [params.size()];
			int i=0;
			for (Map.Entry<String, Object> item : params.entrySet()) {	//kw: foreach hashmap java
				keys[i] = item.getKey();
				values[i] = item.getValue();
				i++;
			}
			
			for(int i1 = 0; i1<keys.length; i1++) {
				if((values[i1] instanceof String) && (StringUtils.isNotBlank(values[i1].toString()))) {
					where.append("AND LOWER (A."+ keys[i1]+") LIKE '%"+values[i1].toString()+"%' ");
				}else if ((values[i1] instanceof Integer) && (values[i1]!=null)) {
					where.append("AND LOWER (A."+ keys[i1]+") = "+values[i1]+" "); 
				}else if ((values[i1] instanceof Long)&& (values[i1]!=null)) {
					where.append("AND LOWER (A."+ keys[i1]+") = "+values[i1]+" "); 
				}
			}
		}
		
		
		//return this.findAll(params,pageable);
	}
	*/
}
