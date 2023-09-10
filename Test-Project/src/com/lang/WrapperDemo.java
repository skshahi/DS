package com.lang;

public class WrapperDemo {
	
	public static void m1(Object  l)
	{
		System.out.println("Long");
	}

	public static void main(String[] args) {
		int x= 10;
		m1(x);
		
		
		
		Boolean b1=new Boolean("yes");
		Boolean b2=new Boolean("no");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2));

	}

}
