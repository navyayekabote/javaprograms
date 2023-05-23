package com.shristi.basic;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {12,23,24,87,45,73};
		System.out.println("before reversing the numbers ");
		for(int a:arr)
		{
			System.out.print(a+"\t");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int rev=0;
			while(temp!=0)
			{
				int rem=temp%10;
				rev=rem+rev*10;
				temp/=10;
			}
			arr[i]=rev;
		}
		System.out.println("After reversing the numbers ");
		for(int a:arr)
			System.out.print(a+"\t");
	}

}
