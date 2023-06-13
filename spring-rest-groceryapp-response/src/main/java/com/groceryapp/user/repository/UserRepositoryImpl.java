package com.groceryapp.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.groceryapp.exceptions.UserNotFoundException;
import com.groceryapp.model.Grocery;
import com.groceryapp.service.IGroceryService;
import com.groceryapp.user.model.User;
@Repository
public class UserRepositoryImpl implements IUserRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private IGroceryService groceryService;
	@Override
	public User addUser(User user) {
		Object userArry[]= {user.getFirstName(),user.getMiddleName(),user.getLastName(),user.getDateOfBirth(),user.getCity(),user.getEmail(),user.getPetName(),user.getUserid(),user.getPassword()};
		jdbcTemplate.update(Queries.InsertQuery,userArry);
		return user;
	}

	@Override
	public void updateUser(String email, int password) {
		jdbcTemplate.update(Queries.updateQuery,password,email);
		
	}

	@Override
	public void deleteUser(String uid) throws UserNotFoundException{
		jdbcTemplate.update(Queries.deleteQuery,uid);
		
	}

	@Override
	public List<User> getAll() {
		return jdbcTemplate.query(Queries.getAllQuery,new UserMapper());
		
	}

	@Override
	public User getByUid(String uid) {
		try {
		User user=jdbcTemplate.queryForObject(Queries.getByIdQuery, new UserMapper(),uid);
		
		return user;
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<Grocery> getByEmailPassword(String email, int password) throws UserNotFoundException{
		User user=jdbcTemplate.queryForObject(Queries.getByEmailPassword,new UserMapper(),email,password);
		User nuser=Optional.of(user)
							.orElseThrow(()->new UserNotFoundException("user not found with that email,password"));
		
		return groceryService.getAll();
	}

}
