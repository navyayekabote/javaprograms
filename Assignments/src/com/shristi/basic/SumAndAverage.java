package com.shristi.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,4};
		int b=arr.length-1;
		int sum=0;
		for(int a:arr)
			sum+=a;
		int average=sum/b;
		System.out.println("Sum and average of all digits in an array is "+average);
	}

}
