package com.map.demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("sonu",1000);
		hm.put("ravi",2000);
		hm.put("vivaan",3000);
		hm.put("atul",null);
		hm.put(null,null);
		hm.put(null,1900);
		Map m2=Collections.synchronizedMap(hm);
		System.out.println(m2);
		System.out.println(hm);
		System.out.println(hm.put("vivaan", 6000));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey() +"--"+m1.getValue());
			
			/*
			 * if(m1.getKey().equals("sonu")) { m1.setValue(9000); }
			 */
			
		}
		System.out.println(hm);

	}

}
