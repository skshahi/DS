package com.lang;

public abstract class AbstractDemo {
	
	AbstractDemo()
	{
		System.out.println("ac");
	}
	AbstractDemo(int i)
	{
		System.out.println("ac1");
	}
	abstract void m();
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		
	}
	

}

class MyClass extends AbstractDemo 
{
	MyClass()
	{
		super(10);
	}
	
	
	public static void main(String[] args) {
		AbstractDemo s=new MyClass();
		s.main(args);
		s.m();
	}

	@Override
	void m() {
		System.out.println("Hi");		
	}
}



