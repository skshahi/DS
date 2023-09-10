package com.app.java8;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		System.out.println(DuplicateElement.class.getCanonicalName());
		System.out.println(DuplicateElement.class.getClassLoader());
		System.out.println(DuplicateElement.class.getClassLoader());
		
		System.out.println(DuplicateElement.class.getClassLoader());
		System.out.println(StreamDemo.class.getClassLoader());
		System.out.println(DuplicateElement.class.getInterfaces());

	}

}
