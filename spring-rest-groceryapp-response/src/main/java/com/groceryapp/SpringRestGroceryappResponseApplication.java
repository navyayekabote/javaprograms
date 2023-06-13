package com.groceryapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.groceryapp.user.model.UserDTO;
import com.groceryapp.user.service.IUserService;
import com.groceryapp.user.util.CsvHelper;

@SpringBootApplication
public class SpringRestGroceryappResponseApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestGroceryappResponseApplication.class, args);
	}
	@Autowired
	private IUserService userService;
	@Autowired
	private CsvHelper csvHelper;

	//@Override
	public void run(String... args) throws Exception {
//		List<UserDTO> userList=csvHelper.getUserDTOList("user.csv");
//		userList.stream().forEach((userDto)->userService.addUser(userDto));
//		
	}

}
