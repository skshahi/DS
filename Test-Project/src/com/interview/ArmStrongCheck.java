package com.interview;

public class ArmStrongCheck {

	public static void main(String[] args) {

		int n = 151;
		int temp = n, sum = 0;
		while (n != 0) {

			int rem = n % 10;
			sum = sum + (rem*rem*rem);
			n = n / 10;
		}
		//System.out.println(sum);
		//System.out.println(temp);
		if(sum==temp)
		{
			System.out.println(temp+" is Armstrong Number.");
		}else
		{
			System.out.println(temp+" is not Armstrong Number.");
		}

	}

}
