package com.app.java8;

interface Intref
{
	public static void m1()
	{
		System.out.println("hello");
	}
}
public class StaticMethodDemo  implements Intref{
	public static void main(String[] args) {
		Intref.m1();
	}

}
