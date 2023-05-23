package com.shristi.basic;

import java.util.*;

public class ArraySquarert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		double[] squareroot=new double[arr.length];
		System.out.println("Enter the values in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			double squarert=Math.sqrt(arr[i]);
			squareroot[i]=squarert;
		}
		System.out.println("THe squareroot of th numbers in an array is");
		for(double number:squareroot)
			System.out.println(number);
	}

}
