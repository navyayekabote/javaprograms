package com.voterapp.service;

import com.voterapp.exception.inValidVoterException;

public interface ElectionBooth {
	boolean checkEligibility(int age,String locality,int vid)throws inValidVoterException;

}
