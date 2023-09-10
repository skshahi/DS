package com.app.java8;

public class CustomClassLoader extends ClassLoader {
	
	@Override
	public Class loadClass(String name) throws ClassNotFoundException
	{
		
		Runtime r=Runtime.getRuntime();
		System.out.println(r);
		
		return Class.forName(name).getClass();
	}

}
