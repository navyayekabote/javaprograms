package com.groceryapp.user.model;

import java.sql.Date;

public class User {
		private String firstName;
		private String middleName;
		private String lastName;
		private String dateOfBirth;
		private String city;
		private String email;
		private String petName;
		private String userid;
		private int password;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPetName() {
			return petName;
		}
		public void setPetName(String petName) {
			this.petName = petName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		
		public User(String firstName, String middleName, String lastName, String dateOfBirth, String city, String email,
				String petName, String userid, int password) {
			super();
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.city = city;
			this.email = email;
			this.petName = petName;
			this.userid = userid;
			this.password = password;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
					+ ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", email=" + email + ", petName=" + petName
					+ ", userid=" + userid + ", password=" + password + "]";
		}
		
	}


