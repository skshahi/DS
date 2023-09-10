package com.interview;

public class PolindromeNumber {

	public static void main(String[] args) {
		int n=171;
		int temp=n,sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println(sum +" is polyndrome number.");
		}else
		{
			System.out.println(sum +" is not polyndrome number.");
		}
		

	}

}
