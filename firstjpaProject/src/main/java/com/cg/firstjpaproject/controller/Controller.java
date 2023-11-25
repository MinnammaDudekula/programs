package com.cg.firstjpaproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.firstjpaproject.DTO.UserDto;
import com.cg.firstjpaproject.entity.User;
import com.cg.firstjpaproject.service.UserService;

import jakarta.validation.Valid;

@RestController
//@AllArgsConstructor
@RequestMapping("/user")
public class Controller {

	@Autowired
	UserService userv;
//	
//	@PostMapping("/adduser")
//	@ResponseStatus(HttpStatus.CREATED)
//	public User addUser(@RequestBody User user) {
//		return userv.createUser(user);
//	}
	
	//user dto
	@PostMapping("/adduserdto")
	public ResponseEntity<UserDto> adduser(@Valid @RequestBody UserDto user){
		UserDto saveuser =userv.createUser(user);
		return ResponseEntity.ok(saveuser);
	}
	
	
	
	
//		@PostMapping("/adduser")
//		public ResponseEntity<User> adduser(@RequestBody User user){
//			User saveuser =userv.createUser(user);
//			return ResponseEntity.ok(saveuser);
//		}
		
	
//   @GetMapping("/getuser/{id}")
//	
//	public ResponseEntity<User> getuserbyid(@PathVariable Long id){
//	   User user=userv.getUserById(id);
//	   return ResponseEntity.ok(user);
//		
//	}
	
	//using dto
	@GetMapping("/getuserdto/{id}")
	public ResponseEntity<UserDto> getuserbyid( @PathVariable Long id){
		   UserDto user=userv.getUserById(id);
	   return ResponseEntity.ok(user);
		
	}
	
	
	
   
   @DeleteMapping("/delete/{id}")
   public void deleteuser(@PathVariable Long id){
	   userv.deteteById(id);
	 
   }
	
}
