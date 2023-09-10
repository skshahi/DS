package com.app.thread;

public class Permutation {

	public static void main(String[] args) {
		printPermutation("abc","");

	}

	private static void printPermutation(String str1, String str2) {
	
		if(str1.length()==0)
		{
			System.out.println(str2);
			return;
		}
		for (int i = 0; i < str1.length(); i++) {
			char ch=str1.charAt(i);
			String lpart=str1.substring(0,i);
			String rpart=str1.substring(i+1);
			String res=lpart+rpart;
			printPermutation(res, str2+ch);
			
		}
		
	}

}
