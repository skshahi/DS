package com.app.thread;

public class ClassLoaderDemo {
	
	String  str;
	
	

	public ClassLoaderDemo(String str) {
		super();
		this.str = str;
	}



	public static void main(String[] args) {
	
		ClassLoaderDemo cl1=new ClassLoaderDemo("Sonu");
		Class c1=cl1.getClass();
				
		ClassLoaderDemo cl2=new ClassLoaderDemo("Atul");
		Class c2=cl2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}

}
