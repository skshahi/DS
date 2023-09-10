package com.lang;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("alalalalalalalalala");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("sonu");
		System.out.println(sb1.capacity());
		
		StringBuffer sb3=new StringBuffer(1000);
		System.out.println(sb3.capacity());
		sb3.append("abc");
		sb3.trimToSize();
		System.out.println(sb3.capacity());
		
		sb3.append("a");
		//sb3.trimToSize();
		System.out.println(sb3.capacity());
		
		System.out.println(sb3.length());

	}

}
