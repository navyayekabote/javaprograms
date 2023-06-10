package com.groceryapp.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryapp.model.Grocery;
import com.groceryapp.user.model.User;
import com.groceryapp.user.model.UserConverter;
import com.groceryapp.user.model.UserDTO;
import com.groceryapp.user.service.IUserService;

@RestController
@RequestMapping("/user-api")
public class UserControllers {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private UserConverter userConverter;
	
	
	@PostMapping(value="/users")
	ResponseEntity<UserDTO> addUser(@RequestBody User user){
		User user1=userService.addUser(user);
		UserDTO userDto=userConverter.toDto(user1);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","adding one user");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(userDto);
	}
	@PatchMapping("/users/email/{email}/password/{password}")
	ResponseEntity<Void> updateUser(@PathVariable("email")String email,@PathVariable("password") int password){
		userService.updateUser(email, password);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","updating the user details");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
	@DeleteMapping("/users/uid/{uid}")
	ResponseEntity<Void> deleteUser(@PathVariable("uid") String uid)
	{
		userService.deleteUser(uid);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","deleting the user details");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
	@GetMapping("/users")
	ResponseEntity<List<User>> getAll(){
		List<User> users=userService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
	@GetMapping("/users/email/{email}/password/{password}")
	ResponseEntity<List<Grocery>> getByEmailPassword(@PathVariable("email")String email,@PathVariable("password") int password){
		List<Grocery> groceries=userService.getByEmailPassword(email, password);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," user details by email and password");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	@GetMapping("/users/uid/{uid}")
	ResponseEntity<User> getById(@PathVariable("uid")String uid){
		User user=userService.getByUid(uid);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," user details by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(user);
	}
}
