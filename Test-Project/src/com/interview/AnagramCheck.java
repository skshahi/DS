package com.interview;

import java.util.LinkedList;
import java.util.List;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1="knee";
		String str2="keen";
		LinkedList ll=new LinkedList();
		if(str1.length()==str2.length())
		{
		for(int i=0;i<str1.length();i++)
		{
			char ch1=str1.charAt(i);
			char ch2=str2.charAt(i);
			if(ll.contains(ch1+"2"))
			{
				ll.removeFirstOccurrence(ch1+"2");
				
			}else
			{
				ll.add(ch1+"1");
			}
			
			if(ll.contains(ch2+"1"))
			{
				ll.removeFirstOccurrence(ch2+"1");
				
			}else
			{
				ll.add(ch2+"2");
			}
			
		}
		//System.out.println(ll);
		
		if(ll.isEmpty())
		{
			System.out.println("Anagram String");
		}else
		{
			System.out.println("Not a Anagram String");
		}

	}else {
		System.out.println("Miss match Entry");
	}
	}

}
