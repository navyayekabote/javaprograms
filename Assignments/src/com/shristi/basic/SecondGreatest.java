package com.shristi.basic;

public class SecondGreatest {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int max=arr[0];
		int secondMax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(secondMax>arr[i])
				secondMax=arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(secondMax<arr[i]&&arr[i]!=max)
				secondMax=arr[i];
		}
		System.out.println("Second Greatest in array is "+secondMax);
	}

}
