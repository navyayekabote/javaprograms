package com.shristi.basic;

public class MaximumOccurence {

	public static void main(String[] args) {
		String word="javaprogramming";
		char[] letters=word.toCharArray();
		int[] repeated=new int[letters.length];
		int count=1;
		int max=0;
		for(int i=0;i<letters.length;i++) {
			count=1;
			for(int j=i+1;j<letters.length;j++)
			{
				if(letters[i]==letters[j])
				{
					count++;
					repeated[j]=-1;
				}
			}
				if(repeated[i]!=-1)
			{
				repeated[i]=count;
			}
		}
		for(int number:repeated)
		{
			if(max<number)
				max=number;
		}
		for(int i=0;i<repeated.length;i++)
		{
			if(repeated[i]==max)
				System.out.println("The maximum ocurrence of letter "+letters[i]+" in a word is "+repeated[i]);
		}

	}

}
