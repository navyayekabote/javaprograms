package com.shristic.absdemos;
import java.util.*;
public class ATMMain {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your input");
				System.out.println("for savings acount press 1");
				System.out.println("for current account press 2");
				int input=sc.nextInt();
				switch(input)
				{
				case 1:
					Savings savings=new Savings(30000);
					System.out.println("Enter your input");
					System.out.println("for withdraw press 1");
					System.out.println("for deposit press 2");
					int input1=sc.nextInt();
					switch(input1)
					{
					case 1:
						savings.withDraw(2000);
						System.out.println(savings.getBalance());
						break;
					case 2:
						savings.deposit(3000);
						System.out.println(savings.getBalance());
					}
					break;
				case 2:
					Current current=new Current(30000);
					System.out.println("Enter your input");
					System.out.println("for withdraw press 1");
					System.out.println("for deposit press 2");
					int input2=sc.nextInt();
					switch(input2)
					{
					case 1:
						current.withDraw(2500);
						System.out.println(current.getBalance());
						break;
					case 2:
						current.deposit(3099);
						System.out.println(current.getBalance());
					}
					break;
				}


	}

}
