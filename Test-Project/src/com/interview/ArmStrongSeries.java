package com.interview;

public class ArmStrongSeries {

	public static void main(String[] args) {
		for(int i=0;i<=1000;i++)
		{
			int temp=i;
			int sum=0;
			int j=i;
			while(j!=0)
			{
				int rem=j%10;
				sum=sum+(rem*rem*rem);
				j=j/10;
			}
			if(sum==temp)
			{
				System.out.println(temp);
			}
		}

	}

}
