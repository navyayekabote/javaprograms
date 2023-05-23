package com.shristi.basic;
import java.util.*;
public class ArraySumScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array values");
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int average=(sum/(arr.length));
		System.out.println("the sum of arry"+sum);
		System.out.println("the average of array"+average);
	}

}
