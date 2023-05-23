package com.shristi.basic;

public class Palindrome {

	public static void main(String[] args) {
		int number=121;
		int palindrme=number;
		int number1=0;
		while(palindrme!=0)
		{
			int rem=palindrme%10;
			number1=number1*10+rem;
			palindrme/=10;
		}
		if(number1==number)
			System.out.println(number+" is a palindrpme number");
		else
			System.out.println(number+" is not a palindrome number");
		

	}

}
