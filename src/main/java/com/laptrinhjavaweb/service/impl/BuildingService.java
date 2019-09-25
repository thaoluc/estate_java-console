package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService{

	private IBuildingRepository buildingRepository;
	private BuildingConverter buildingConverter;


	public BuildingService() {
		buildingRepository = new BuildingRepository();
		buildingConverter = new BuildingConverter();
	}
	
	@Override
	public List<BuildingDTO> findAll(BuildingSearchBuilder fieldSearch, Pageable pageable) {
		//Java 7
	/*	List<BuildingDTO> results = new ArrayList<>();
		List<BuildingEntity> buildingEntities = buildingRepository.findAll();
		for(BuildingEntity building:buildingEntities) {
			BuildingDTO buildingDTO = buildingConverter.convertToDTO(building);
			results.add(buildingDTO);
		}
		return results;*/
		
		//Java 8: one line code o_o o.o *.* =.=
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("name", fieldSearch.getName());
		properties.put("district", fieldSearch.getDistrict());
		properties.put("buildingarea", fieldSearch.getBuildingArea());
		properties.put("numberofbasement", fieldSearch.getNumberOfBasement());
		
		List<BuildingEntity> buildingEntities = buildingRepository.findAll(properties, pageable);
		return buildingEntities.stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());
		/*return buildingRepository.findAll().stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());*/
	}

}
