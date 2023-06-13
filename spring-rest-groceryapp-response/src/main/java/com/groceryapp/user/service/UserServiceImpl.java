package com.groceryapp.user.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryapp.exceptions.UserNotFoundException;
import com.groceryapp.model.Grocery;
import com.groceryapp.user.model.User;
import com.groceryapp.user.model.UserConverter;
import com.groceryapp.user.model.UserDTO;
import com.groceryapp.user.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	static int i = 0;
	@Autowired
	private UserConverter userConverter;
	@Autowired
	private IUserRepository userRepository;

	// this method is to add user with the help of rest api
	@Override
	public User addUser(User user) {
		String uid = generateUid(user);
		User userById = getByUid(uid);
		User user1;
		if (userById == null) {
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			user1 = userRepository.addUser(user);
		} else {
			uid = generateUid1(user);
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			user1 = userRepository.addUser(user);
		}
		return user1;
	}

	// this method is to add user with the help of csv file
	@Override
	public User addUser(UserDTO userDto) {
		User user = userConverter.toEntity(userDto);
		String uid = generateUid(user);
		User userById = getByUid(uid);
		User user1;
		if (userById == null) {
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			user1 = userRepository.addUser(user);
		} else {
			uid = generateUid1(user);
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			user1 = userRepository.addUser(user);
		}
		return user1;
	}

	// generating the userid for the 1st time
	public String generateUid(User user) {
		String fname = user.getFirstName();
		String mname = user.getMiddleName();
		if (mname == null) {
			mname = "n";
		}
		if (i == 9) {
			i = 0;
		}
		String lname = user.getLastName();
		String city = user.getCity();
		String uid;
		uid = city.substring(0, 2) + fname.charAt(0) + mname.charAt(0) + lname.charAt(0) + (i++);
		return uid;
	}

	// generating the another userid if it already exists in the table
	public String generateUid1(User user) {
		String fname = user.getFirstName();
		String mname = user.getMiddleName();
		if (mname == null) {
			mname = "r";
		}
		if (i == 9) {
			i = 0;
		}
		String lname = user.getLastName();
		String city = user.getCity();
		String uid;
		uid = lname.charAt(0) + city.substring(0, 2) + fname.charAt(0) + mname.charAt(0) + (i++);
		return uid;
	}

	// generating the password
	public int generatePassword() {
		int password = 0;
		Random r = new Random();
		for (int i = 1; i <= 4; i++) {
			int k = r.nextInt(9);
			password = password * 10 + k;
		}
		return password;
	}

	// updating the user's password using email
	@Override
	public void updateUser(String email, int password) {
		userRepository.updateUser(email, password);
	}

	// deleting the user by userid
	@Override
	public void deleteUser(String uid) {
		userRepository.deleteUser(uid);

	}

	// getting all the details of all users
	@Override
	public List<User> getAll() {
		List<User> users = userRepository.getAll();
		return users;
	}

	// getting the user details according to userId
	@Override
	public User getByUid(String uid) {
		User user = userRepository.getByUid(uid);
		return user;
	}

	// user login by using his email and password
	@Override
	public List<Grocery> getByEmailPassword(String email, int password) throws UserNotFoundException {
		List<Grocery> groceries = userRepository.getByEmailPassword(email, password);
		
		return groceries;
	}

}
