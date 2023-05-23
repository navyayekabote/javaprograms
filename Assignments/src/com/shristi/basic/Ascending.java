package com.shristi.basic;

public class Ascending {

	public static void main(String[] args) {
		int[] arr= {23,13,45,36,58};
		System.out.println("Before sorting");
		for(int a:arr)
			System.out.print(a+"\t");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending order is");
		for(int a:arr)
			System.out.print(a+"\t");
}
}
