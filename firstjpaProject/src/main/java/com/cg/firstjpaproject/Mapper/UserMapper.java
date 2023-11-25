package com.cg.firstjpaproject.Mapper;

import com.cg.firstjpaproject.DTO.UserDto;
import com.cg.firstjpaproject.entity.User;

public class UserMapper {
	//convert userjap enity to userdTo
	public static UserDto mapToUserDto(User user) {
		UserDto userdto=new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName()
				);
		return userdto;
	}
	//convert userdto into userjpa
	public static  User mapToUser(UserDto userdto) {
		User user=new User(
				userdto.getId(),
				userdto.getfirstName(),
				userdto.getLastName()
				);
		return user;
		
	}

}
