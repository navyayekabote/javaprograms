package com.shristi.basic;

import java.util.Scanner;

public class EvenScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		System.out.println("Even numbers are");
		for(int i=1;i<=number;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}

	}

}
