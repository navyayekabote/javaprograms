package com.shristi.basic;

public class LongestWord {

	public static void main(String[] args) {
		String sentence="You are doing java programme";
		String[] word=sentence.split(" ");
		int max=0;
		int i=0;
		int index=0;
		for(String words:word)
		{
			char[] character=words.toCharArray();
			if(i==0)
			max=character.length;
			else
			{
				int lengt=character.length;
				if(max<lengt)
				{
					max=lengt;
				index=i;
				}
			}
			i++;
		}
		for(int j=0;j<word.length;j++) {
			if(j==index)
			System.out.println("The longest word in the sentence is "+word[j]);
		}
	}

}
