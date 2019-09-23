package com.laptrinhjavaweb.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
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
	public List<BuildingDTO> findAll() {
		//Java 7
	/*	List<BuildingDTO> results = new ArrayList<>();
		List<BuildingEntity> buildingEntities = buildingRepository.findAll();
		for(BuildingEntity building:buildingEntities) {
			BuildingDTO buildingDTO = buildingConverter.convertToDTO(building);
			results.add(buildingDTO);
		}
		return results;*/
		
		//Java 8: one line code o_o o.o *.* =.=
		
		List<BuildingEntity> buildingEntities = buildingRepository.findAll();
		return buildingEntities.stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());
		/*return buildingRepository.findAll().stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());*/
	}

}
