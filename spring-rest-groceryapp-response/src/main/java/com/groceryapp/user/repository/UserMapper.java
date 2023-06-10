package com.groceryapp.user.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.groceryapp.user.model.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setFirstName(rs.getString("firstname"));
		user.setMiddleName(rs.getString("middlename"));
		user.setLastName(rs.getString("lastname"));
		user.setDateOfBirth(rs.getString("dateofbirth"));
		user.setCity(rs.getString("city"));
		user.setEmail(rs.getString("email"));
		user.setPetName(rs.getString("petname"));
		user.setUserid(rs.getString("userid"));
		user.setPassword(rs.getInt("password"));
		return user;
	}

}
