package com.shristi.basic;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		String[] usernameary= {"sree","sri","navya","rohit","nandi"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username as login");
		String name=sc.next();
		int count=0;
		for(String username:usernameary)
		{
			if(username.equals(name))
				count++;
		}
		if(count==0)
			System.out.println("Invalid username");
		else
			System.out.println("You are logged in successfully");
	}

}
