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
public class UserServiceImpl implements IUserService{

	static int i=0;
	@Autowired
	private UserConverter userConverter;
	@Autowired
	private IUserRepository userRepository;
	@Override
	public User addUser(User user) {
	String uid=generateUid(user);
	User userById=getByUid(uid);
	User user1;
	if(userById==null)
	{
		int password=generatePassword();
		user.setUserid(uid);
		user.setPassword(password);
		user1=userRepository.addUser(user);
	}
	else {
		uid=generateUid1(user);
		int password=generatePassword();
		user.setUserid(uid);
		user.setPassword(password);
	    user1=userRepository.addUser(user);
	}
	return user1;
	}
	@Override
	public User addUser(UserDTO userDto) {
		User user=userConverter.toEntity(userDto);
		String uid=generateUid(user);
		User userById=getByUid(uid);
		User user1;
		if(userById==null)
		{
			int password=generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			user1=userRepository.addUser(user);
		}
		else {
			uid=generateUid1(user);
			int password=generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
		    user1=userRepository.addUser(user);
		}
		return user1;
		}
	public int generatePassword() {
		int password=0;
		Random r=new Random();
		for(int i=1;i<=4;i++) {
			int k=r.nextInt(9);
			password=password*10+k;
		}
		return password;
	}
	public String generateUid1(User user)
	{
		String fname=user.getFirstName();
		String mname=user.getMiddleName();
		if(mname==null) {
			mname="r";
		}
		if(i==9)
		{
			i=0;
		}
		String lname=user.getLastName();
		String city=user.getCity();
		String uid;
		uid=lname.charAt(0)+city.substring(0,2)+fname.charAt(0)+mname.charAt(0)+(i++);
		return uid;
	}
	public String generateUid(User user)
	{
		String fname=user.getFirstName();
		String mname=user.getMiddleName();
		if(mname==null) {
			mname="n";
		}
		if(i==9)
		{
			i=0;
		}
		String lname=user.getLastName();
		String city=user.getCity();
		String uid;
		uid=city.substring(0,2)+fname.charAt(0)+mname.charAt(0)+lname.charAt(0)+(i++);
		return uid;
	}
	

	@Override
	public void updateUser(String email, int password) {
		userRepository.updateUser(email, password);
	}

	@Override
	public void deleteUser(String uid) {
		userRepository.deleteUser(uid);
		
	}

	@Override
	public List<User> getAll() {
		List<User> users=userRepository.getAll();
		return users;
	}

	@Override
	public User getByUid(String uid) {
		User user=userRepository.getByUid(uid);
		return user;
	}

	@Override
	public List<Grocery> getByEmailPassword(String email, int password) throws UserNotFoundException {
		List<Grocery> groceries=userRepository.getByEmailPassword(email, password);
		return groceries;
	}

}
