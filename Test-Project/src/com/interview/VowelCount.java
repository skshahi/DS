package com.interview;

import java.util.HashMap;
import java.util.HashSet;

public class VowelCount {

	public static void main(String[] args) {
		String str="kdguyredbaiouwoiepupfbcbaoiuedaAAshf".toLowerCase();
		HashSet hs=new HashSet();
		hs.add('a');
		hs.add('e');
		hs.add('i');
		hs.add('o');
		hs.add('u');
		
		HashMap hm=new HashMap();
		
		for(int i=0;i<str.length();i++)
		{
			if(hs.contains(str.charAt(i)))
			{
				//System.out.println("he");
				if(hm.containsKey(str.charAt(i)))
				{
					hm.put(str.charAt(i), (Integer)hm.get(str.charAt(i))+1);
				}else
				{
					hm.put(str.charAt(i), 1);
				}
			}
			//System.out.println("helo");
		}
		
		System.out.println(hm);
		

	}

}
