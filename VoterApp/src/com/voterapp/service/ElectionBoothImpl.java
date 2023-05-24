package com.voterapp.service;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.exception.inValidVoterException;
import com.voterapp.exception.NoVoterIdException;

public class ElectionBoothImpl implements ElectionBooth {
	String[] localities= {"banglore","tirupati","adoni"};
	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws inValidVoterException {
		boolean resultage=checkAge(age);
		if(resultage==true)
		{
			boolean resultlocality=checkLocality(locality);
					if(resultlocality==true)
					{
						boolean resultvid=checkVoterId(vid);
						if(resultvid==true)
							return true;
						else 
							return false;
					}
					else
						return false;
		}
		else
		return false;
	}
	private boolean checkAge(int age) throws UnderAgeException {
		if(age<18)
			throw new UnderAgeException("your age should be above 18");
		else
			//System.out.println("your age is eligible for voter id");
			return true;
	}
	private boolean checkLocality(String locality) throws LocalityNotFoundException
	{int count=0;
		for(String localty:localities)
		{
			
			if(localty.equals(locality))
			{
				//System.out.println("locality found");
				count++;
				break;
			}
		}
			if(count==0)
			{
				throw new LocalityNotFoundException("locality doesnt found");
			}
		
		return true;
	}
	private boolean checkVoterId(int vid) throws NoVoterIdException
	{
		if(vid>=1000&&vid<=9999)
		{
			//System.out.println("voter id is in range");
			
		}
		else
		{
			throw new NoVoterIdException("no voter id with that number");
		}
		return true;
		
	}
}



