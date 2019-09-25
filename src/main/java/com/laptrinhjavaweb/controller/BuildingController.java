package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {

	
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		int page = 2;
		int limit = 2;
		String name = "building";
		String district = "";
		Integer buildingArea = null;
		Integer numberOfBasement = null;
		
		IBuildingService buildingService = new BuildingService();
		
		BuildingSearchBuilder fieldSearch = new BuildingSearchBuilder.Builder().setName(name).setDistrict(district)
																				.setBuildingArea(buildingArea).setNumberOfBasement(numberOfBasement)
																				.build();
		Pageable pageable = new PageRequest(page,limit);
		List<BuildingDTO> buildings = buildingService.findAll(fieldSearch, pageable);
		for(BuildingDTO item:buildings) {
			System.out.println("Id: "+item.getId()+" - "+ "Name: "+item.getName()+" - "+"Street: "+item.getStreet());
		}
	}
}