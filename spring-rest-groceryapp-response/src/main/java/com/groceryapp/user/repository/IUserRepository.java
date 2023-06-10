package com.groceryapp.user.repository;

import java.util.List;
import java.util.Optional;

import com.groceryapp.model.Grocery;
import com.groceryapp.user.model.User;

public interface IUserRepository {
	User addUser(User user);
	void updateUser(String email,int password);
	void deleteUser(String uid);
	List<User> getAll();
	User getByUid(String uid);
	List<Grocery> getByEmailPassword(String email,int password);
}
