package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;

public class UserConverter {

	public UserDTO convertToDTO (UserEntity userEntity) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userEntity, UserDTO.class);
	}
}
