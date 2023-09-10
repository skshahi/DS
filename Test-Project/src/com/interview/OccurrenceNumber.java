package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OccurrenceNumber {


	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(20);
		System.out.println(al);
		HashMap hm=new HashMap();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			int n=(int) itr.next();
			if(hm.containsKey(n))
			{
				hm.put(n, (int)hm.get(n)+1);
			}else
			{
				hm.put(n, 1);
			}
		}
		System.out.println(hm);
				
	}


}
