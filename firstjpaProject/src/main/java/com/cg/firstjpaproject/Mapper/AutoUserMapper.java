package com.cg.firstjpaproject.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cg.firstjpaproject.DTO.UserDto;
import com.cg.firstjpaproject.entity.User;

@Mapper
public interface AutoUserMapper {
	
//IMPLEMENTATION OF THIS INTERFACE
	AutoUserMapper Mapper=Mappers.getMapper(AutoUserMapper.class);
	UserDto maptoUserDto(User user);
	User maptoUser(UserDto usedto);
	
}
