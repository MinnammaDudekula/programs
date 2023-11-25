package com.cg.firstjpaproject.DTO;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

public class UserDto {
	
	private Long id;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public UserDto(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	public UserDto() {
		super();
	}
	

}
