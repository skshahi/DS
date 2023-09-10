package com.code;

public class FactorialNumber {

	public static void main(String[] args) {
		/*
		 * int n=5; int fac=1; for(int i=n;i>0;i--) { fac=fac*i; }
		 * 
		 * System.out.println(fac);
		 */
		int v = fac(5);
		System.out.println(v);

	}

	private static int fac(int i) {

		if (i == 0)
			return 1;
		else
			return i * fac(i - 1);
	}

}
