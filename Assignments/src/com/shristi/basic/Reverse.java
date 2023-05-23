package com.shristi.basic;

public class Reverse {

	public static void main(String[] args) {
		int number=123;
		int temp=number;
		int reverse=0;
		while(temp!=0)
		{
			int rem=temp%10;
			reverse=rem+(reverse*10);
			temp/=10;
		}
		System.out.println("The reversed numbe is: "+reverse);
	}

}
