package com.code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter String :");
		 * String s=sc.next();
		 * 
		 * System.out.println(s);
		 */

		String s="Sonu";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
