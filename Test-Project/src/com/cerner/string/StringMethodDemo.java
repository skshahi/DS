package com.cerner.string;

public class StringMethodDemo {

	public static void main(String[] args) {
		String s1 = "Sonu";
		String s2 = "Sonu";
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s2));

		// format method
		System.out.println(String.format("%a", 10.0));
		System.out.println(String.format("%b", null));
		System.out.println(String.format("%c", 68));

		String str = new String("Welcome to JavaTpoint");
		String str1 = new String("Welcome to JavaTpoint");
		System.out.println(str1 == str); // prints false

		String str2 = new String("Welcome to JavaTpoint").intern();
		String str3 = new String("Welcome to JavaTpoint").intern();
		System.out.println(str2 == str3); // prints true
		String w="";
		//String e=null;
		System.out.println(w.length());
		//System.out.println(e.length());//NPE

	}

}
