package com.code;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10,b=20;
		/*
		 * int t; System.out.println(a+"--"+b); t=a+b; a=t-a; b=t-a;
		 * System.out.println(a+"--"+b);
		 */
		System.out.println(a+"--"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"--"+b);

	}

}
