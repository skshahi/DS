package com.cerner;

interface interf
{
	public void m1();
	public default void m2() {
		System.out.println("default method");
	}
}
class Test11 implements interf
{

	@Override
	public void m1() {
		System.out.println("Test11 class");
		
	}
	
}
class Test12 implements interf
{

	@Override
	public void m1() {
		System.out.println("Test12 class");
		
	}
	@Override
	public void m2() {
		System.out.println("Test12 class:overriding default method");
		
	}
	
}
class Test13 implements interf
{

	@Override
	public void m1() {
		System.out.println("Test13 class");
		
	}
	
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		Test11 t1=new Test11();
		t1.m1();
		t1.m2();
		
		Test12 t2=new Test12();
		t2.m1();
		t2.m2();
		Test13 t3=new Test13();
		t3.m1();
		t3.m2();

	}

}
