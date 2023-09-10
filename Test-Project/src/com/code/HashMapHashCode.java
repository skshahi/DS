package com.code;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapHashCode {

	public static void main(String[] args) {
		int h;
		String key = "sonu";
		System.out.println(key.hashCode());
		System.out.println(key.hashCode());
		System.out.println(h = key.hashCode());
		System.out.println(h >>> 16);
		System.out.println(2^3);//100 110
		System.out.println(1>>>16);

		int m = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
		System.out.println(m);
		
		HashSet s=new HashSet();
		Hashtable t=new Hashtable();
		
		LinkedList ll=new LinkedList<>();
		TreeMap t1=new TreeMap();
		TreeSet ts=new TreeSet();

	}

}
