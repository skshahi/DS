package com.interview;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int n=13;
		boolean b=false;
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(i!=1 && n%i==0)
			{
				b=true;
				break;
			}
		}
		
		if(b)
		{
			System.out.println(n+" is not prime number");
		}else
		{
			System.out.println(n+" is  prime number");
		}
			
		

	}

}
