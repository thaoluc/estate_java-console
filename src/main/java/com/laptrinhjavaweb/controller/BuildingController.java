package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {

	
	public static void main(String[] args) {
		IBuildingService buildingService = new BuildingService();
		List<BuildingDTO> buildings = buildingService.findAll();
		for(BuildingDTO item:buildings) {
			System.out.println("Name: "+item.getName()+" - "+"Street: "+item.getStreet());
		}
	}
}