package com.collection.demo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println(hs.size());
		hs.add(null);
		System.out.println(hs.add(null));
		System.out.println(hs.add(10));
		System.out.println(hs.add(10));
		hs.add(10);
		hs.add(20);
		hs.add(null);
		
		hs.add(30);
		hs.add(15);
		System.out.println(hs);
		
		
		


	}

}
