package com.lang;

import java.lang.reflect.Method;

public class ObjectMethod {

	public static void main(String[] args) {
	int count=0;
	
	try {
		Class c=Class.forName("java.lang.Object");
		Method []m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("Total method: "+count);
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	

	}

}
