package com.groceryapp.user.service;

import java.util.List;

import com.groceryapp.exceptions.UserNotFoundException;
import com.groceryapp.model.Grocery;
import com.groceryapp.user.model.User;
import com.groceryapp.user.model.UserDTO;


public interface IUserService {
		User addUser(User user);
		User addUser(UserDTO userDto);
		void updateUser(String email,int password);
		void deleteUser(String uid);
		List<User> getAll();
		User getByUid(String uid);
		List<Grocery> getByEmailPassword(String email,int password)throws UserNotFoundException;
}
