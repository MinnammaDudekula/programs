package com.cg.firstjpaproject.service;

import java.util.Optional;

import com.cg.firstjpaproject.DTO.UserDto;
import com.cg.firstjpaproject.entity.User;

public interface UserService {
	UserDto createUser(UserDto user);
//	User createUser(User user);
	
	
//	User getUserById(Long UserId);
	
	UserDto getUserById(Long UserId);
	void deteteById(Long UserId);
}
