package com.interview.string;

public class MaxOccurenceChar {

	public static void main(String[] args) {
		String str="sdfghjkkjhgfdsasdfgg";
		
		int max=0;
		char ch = 0;
		
		for(int i=0;i<str.length();i++)
		{
			int max1=0;
			char ch1=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					max1++;
					
				}
			}
			if(max1>max)
			{
				max=max1;
				ch=ch1;
			}
		}
		
		System.out.println(ch+"--"+max);

	}

}
