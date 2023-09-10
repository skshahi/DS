package com.interview.string;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = String.join("-", "sonu", "") ;
		String str2 = String.join("-", "sonu", "kumar") ;
		
		Thread t=new Thread();
		
		String str11[]=str1.split("-");
		System.out.println(str11.length);
		for(String s:str11)
		{
			System.out.println(s);
		}
		
		String str22[]=str2.split("-");
		System.out.println(str22.length);
		for(String s:str22)
		{
			System.out.println(s);
		}
		
		System.out.println(str1);
		System.out.println(str2);

	}

}
