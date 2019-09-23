package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public class BuildingConverter {
	
	//convert data từ entity -> dto
	public BuildingDTO convertToDTO (BuildingEntity buildingEntity) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(buildingEntity, BuildingDTO.class);
	}
	
}
