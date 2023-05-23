package com.shristi.basic;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int min=arr[0];
		int secondMin=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			if(secondMin<arr[i])
				secondMin=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(secondMin>arr[i]&&arr[i]!=min)
				secondMin=arr[i];
		}
		System.out.println("Second Smallest in an array is "+secondMin);
	}

}
