package com.shristi.basic;

public class Armstrong {

	public static void main(String[] args) {
		int number=153;
		int temp=number;
		int armstrg=0;
		while(temp!=0)
		{
			int rem=temp%10;
			armstrg=armstrg+(rem*rem*rem);
			temp/=10;
		}
		if(armstrg==number)
			System.out.println(number+" is a armstrong");
		else
			System.out.println(number+" is not a armstrong");
	}

}
