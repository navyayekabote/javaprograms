package com.groceryapp.user.model;

public class UserDT {
private String userId;
private int password;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public UserDT(String userId, int password) {
	super();
	this.userId = userId;
	this.password = password;
}
public UserDT() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "UserDT [userId=" + userId + ", password=" + password + "]";
}

}
