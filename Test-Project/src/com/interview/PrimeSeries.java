package com.interview;

public class PrimeSeries {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			boolean b=false;
			for(int j=1;j<=Math.sqrt(i);j++)
			{
				if(j!=1 && i%j==0)
				{
					b=true;
					break;
				}
				
			}
			if(!b)
			{
				System.out.println(i);
			}
		}

	}

}
