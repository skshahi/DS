package com.interview.string;

//Rule to create  Singleton class
//1. private constructor
//2. private static variable
//3. public factory method



class Singleton
{
	private static Singleton singleton=null;
	private Singleton()
	{
		
	}
	
	public static Singleton getObject()
	{
		if(singleton==null)
		{
			singleton=new Singleton();
			return singleton;
		}else
		{
			return singleton;
			
		}
	}
}
public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1=Singleton.getObject();
		Singleton s2=Singleton.getObject();
		if(s1==s2)
		{
			System.out.println("Singleton");
		}else
		{
			System.out.println("Not a Singleton");
		}

	}

}
