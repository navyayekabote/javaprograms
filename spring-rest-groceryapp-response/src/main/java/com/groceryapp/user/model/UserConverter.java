package com.groceryapp.user.model;

import org.springframework.stereotype.Component;

@Component
public class UserConverter {

	public UserDTO toDto(User user) {
		UserDTO userDto=new UserDTO();
		userDto.setUserid(user.getUserid());
		userDto.setPassword(user.getPassword());
		return userDto;
	}
	
	public User toEntity(UserDTO userDto)
	{
		User user=new User();
		user.setFirstName(userDto.getFirstName());
		user.setMiddleName(userDto.getMiddleName());
		user.setLastName(userDto.getLastName());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setCity(userDto.getCity());
		user.setEmail(userDto.getEmail());
		user.setPetName(userDto.getPetName());
		return user;
	}
}
