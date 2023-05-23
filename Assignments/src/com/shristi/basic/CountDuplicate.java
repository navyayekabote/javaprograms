package com.shristi.basic;

public class CountDuplicate {

	public static void main(String[] args) {
		int[] arr= {2,5,2,4,5,3,1,6,3};
		int req[]=new int[arr.length];
		int repeat=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
					req[j]=repeat;
				}
			}
			if(req[i]!=-1)
				req[i]=count;
		}
	
	for(int i=0;i<req.length;i++) {
		if(req[i]>1)
			System.out.println(arr[i]+ " duplicated "+req[i]+" times");
	}
	}
}
