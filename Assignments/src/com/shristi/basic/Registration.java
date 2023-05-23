package com.shristi.basic;
import java.util.*;
public class Registration {

	public static void main(String[] args) {
		String[] arr=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter th values in array");
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			String name=sc.next();
			int count=0;
			
			for(int j=k-1;j>=0;j--)
			{
				if(i==0) {
					arr[i]=name;
					k++;
					count++;
				}
				else
				{
				if(arr[j].equals(name))
				{
					count++;
				}
				}
			}
			if(count==0)
				{
					arr[k++]=name;
					System.out.println("You are registered");
				}
			else
			{
				System.out.println("Name is not unique");
				i--;
			}
		}
		
	}

}
