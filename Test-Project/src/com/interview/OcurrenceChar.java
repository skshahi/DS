package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OcurrenceChar {

	public static void  main(String srhs[]) {
		
		String str="ABABABDCDCABBD";
		HashMap hm=new HashMap();
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(!hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), count);
			}
		}
		System.out.println(hm);
		
		
		

	}

}
