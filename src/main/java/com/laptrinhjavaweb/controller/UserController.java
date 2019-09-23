package com.laptrinhjavaweb.controller;
import java.util.List;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.IUserService;
import com.laptrinhjavaweb.service.impl.UserService;

public class UserController {
	public static void main(String[] args) {
		IUserService userService = new UserService();
		List<UserDTO> users=userService.findAll();
		for(UserDTO item:users) {
			System.out.println("User: "+item.getUserName()+" Tên: "+item.getFullName());
		}
	}
}
