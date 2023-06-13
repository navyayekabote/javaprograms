package com.groceryapp.user.repository;

import java.util.List;

import com.groceryapp.exceptions.UserNotFoundException;
import com.groceryapp.model.Grocery;
import com.groceryapp.user.model.User;

public interface IUserRepository {
	User addUser(User user);
	void updateUser(String email,int password);
	void deleteUser(String uid)throws UserNotFoundException;
	List<User> getAll();
	User getByUid(String uid);
	List<Grocery> getByEmailPassword(String email,int password)throws UserNotFoundException;
}
