package com.interview.string;

import java.util.HashMap;

public class MaxOcurrenceChar {

	
	public static void main(String[] args) {
		String str="asgagadbsdbvcdandcnafcbsbsacb";
		int max=0;
		char key = 0;
		HashMap hm=new HashMap();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(hm.containsKey(ch))
			{
				int v=(Integer)hm.get(ch)+1; 
				hm.put(ch, v);
				if(v>max)
				{
					max=v;
					key=ch;
				}
			}else
			{
				hm.put(ch, 1);				
					max=1;
					key=ch;
				
			}
		}
		System.out.println(hm);
		System.out.println(key+" max:"+max);
		
		
		

	}

}
