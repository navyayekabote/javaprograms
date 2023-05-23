package com.shristi.basic;

public class Fibinacco {

	public static void main(String[] args) {
		int number=6;
		int num1=0;
		int num2=1;
		int fibi;
		System.out.println("fibinacco series is");
		System.out.println(num1);
		System.out.println(num2);
		for(int i=3;i<=number;i++)
		{
			fibi=num1+num2;
			System.out.println(fibi);
			num1=num2;
			num2=fibi;
		}
	}

}
