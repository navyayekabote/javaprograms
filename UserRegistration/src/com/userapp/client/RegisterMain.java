package com.userapp.client;

import java.util.*;

import com.userapp.Exception.NameExistsException;
import com.userapp.Exception.TooLongException;
import com.userapp.Exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class RegisterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.next();
		
		IValidationService ivalidationservice = new ValidationServiceImpl();
		try
		{
		boolean usernameresult = ivalidationservice.validateUserName(username);
		if (usernameresult==true) {
			System.out.println("enter the password");
		String password = sc.next();
			boolean passwordresult = ivalidationservice.validatePassword(password);
			if (passwordresult == true) {
				System.out.println("You are registered succcessfully");
			}
		}}
		catch(NameExistsException | TooShortException | TooLongException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
