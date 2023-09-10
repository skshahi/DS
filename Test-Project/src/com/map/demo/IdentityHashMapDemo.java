package com.map.demo;
import java.util.HashMap;
import java.util.IdentityHashMap;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap hm=new IdentityHashMap();
		//HashMap hm=new HashMap<>();
		//System.out.println(hm.size());
		
		hm.put(new Integer(10), "sonu");
		hm.put(new Integer(10), "ravi");
		System.out.println(hm);

	}

}
