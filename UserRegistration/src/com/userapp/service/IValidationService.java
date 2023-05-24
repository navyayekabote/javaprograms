package com.userapp.service;

import com.userapp.Exception.NameExistsException;
import com.userapp.Exception.TooLongException;
import com.userapp.Exception.TooShortException;

public interface IValidationService {
	boolean validateUserName(String username) throws NameExistsException;
	boolean validatePassword(String password) throws TooShortException,TooLongException;
}
