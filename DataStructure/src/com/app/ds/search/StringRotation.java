package com.app.ds.search;

public class StringRotation {
	
	public static String rightRotate(String str,int num)
	{
		return str.substring(str.length()-num)+str.substring(0, str.length()-num);
	}
	public static String leftRotate(String str,int num)
	{
		return str.substring(num)+str.substring(0,num);
	}
	

	public static void main(String[] args) {
		String str="hellowrold";
		
		System.out.println("Right Rotation:::"+rightRotate(str, 2));
		System.out.println("Left Rotation:::"+leftRotate(str, 3));
		

	}

}
