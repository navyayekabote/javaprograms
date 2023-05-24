package com.userapp.service;

import com.userapp.Exception.NameExistsException;
import com.userapp.Exception.TooLongException;
import com.userapp.Exception.TooShortException;

public class ValidationServiceImpl implements IValidationService{

	
	@Override
	public boolean validateUserName(String username) throws NameExistsException {
		String[] usernames= {"sree","navya","sri"};
		int count=0;
		for(String uname:usernames)
		{
			if(username.equals(uname)) {
				throw new NameExistsException("Name is already exists");
				
			}
		}
		return true;
					
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if(password.length()<6)
			throw new TooShortException("Your password is too short");
		else if(password.length()>15)
			throw new TooLongException("Your password is too long");
		else
			return true;
		
	}

}
