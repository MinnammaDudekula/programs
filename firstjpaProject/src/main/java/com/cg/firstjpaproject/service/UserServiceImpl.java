package com.cg.firstjpaproject.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.firstjpaproject.DTO.UserDto;
import com.cg.firstjpaproject.Mapper.AutoUserMapper;
import com.cg.firstjpaproject.Mapper.UserMapper;
import com.cg.firstjpaproject.entity.User;
import com.cg.firstjpaproject.repository.UserRepository;

@Service

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository urepo;
	@Autowired
	public ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(UserDto userdto) {
		//convert userdto into userjpa entity
//		User user=UserMapper.mapToUser(userdto);
		User user=modelMapper.map(userdto, User.class);
		
		//mapstruct
		//User user=AutoUserMapper.Mapper.maptoUser(userdto);
		
		User saveduser=urepo.save(user);
			
		//convert userjpa entity to userdto bcs saveduser contians primary key
//		UserDto saveduserdto=UserMapper.mapToUserDto(saveduser);
		
		UserDto saveduserdto=modelMapper.map(saveduser, UserDto.class);
		//UserDto saveduserdto=AutoUserMapper.Mapper.maptoUserDto(saveduser);
		return saveduserdto;
	}
//	@Override
//	public User createUser(User user) {
//		
//		return urepo.save(user);
//	}
	
	
	
//	@Override
//	public User getUserById(Long UserId) {
//		Optional<User>  oUser = urepo.findById(UserId);
//		return oUser.get();
//	}
	
	//using dto
	public UserDto getUserById(Long UserId) {
	Optional<User>  oUser = urepo.findById(UserId);
	User user= oUser.get();
//	return UserMapper.mapToUserDto(user);
return modelMapper.map(user, UserDto.class);
	//return AutoUserMapper.Mapper.maptoUserDto(user);
	
	}
	
	
	
	public void deteteById(Long UserId) {
		urepo.deleteById(UserId);
		
	}

}
