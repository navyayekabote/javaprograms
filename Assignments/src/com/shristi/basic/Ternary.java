package com.shristi.basic;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int greater=num1>num2&&num1>num3?num1:num2>num3?num2:num3;
		System.out.println("the greater  number is "+greater);
	}

}
