package com.shristi.basic;

public class Greater {

	public static void main(String[] args) {
	int[] arr= {10,20,30,40};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
			max=arr[i];
	}
	System.out.println("greatest number is "+max);
}

}

