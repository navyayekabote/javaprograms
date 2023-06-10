package com.groceryapp.user.repository;

public class Queries {
	static String InsertQuery="insert into users(firstName,middleName,lastName,dateOfBirth,city,email,petName,userid,password) values(?,?,?,?,?,?,?,?,?)";
	static String updateQuery="update users set password=? where email=?";
	static String deleteQuery="delete from users where userid=?";
	static String getAllQuery="select * from users";
	static String getByIdQuery="select * from users where userid=?";
	static String getByEmailPassword="select * from users where email=? and password=?";
}
