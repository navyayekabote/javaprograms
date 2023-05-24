package com.voterapp.main;
import java.util.*;

import com.voterapp.exception.*;
import com.voterapp.service.ElectionBooth;
import com.voterapp.service.ElectionBoothImpl;
public class VoterMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Age");
		int age=sc.nextInt();
		System.out.println("Enter your locality");
		String locality=sc.next();
		System.out.println("Enter your voterid");
		int vid=sc.nextInt();
		try {
			ElectionBooth electionBooth=new ElectionBoothImpl();
			boolean result=electionBooth.checkEligibility(age,locality,vid);
			if(result)
			{
				System.out.println("Successfully registered for voterid");
			}
		}catch(inValidVoterException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
