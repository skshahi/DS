package com.app.thread;

public class StudentDemo {

	public static void main(String[] args) {
		StudentDemo s1=new StudentDemo();
		Class c1=s1.getClass();
		
		StudentDemo s2=new StudentDemo();
		Class c2=s2.getClass();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		

	}

}
