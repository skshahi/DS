package com.collection.demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(90);
		lhs.add("sonu");
		lhs.add(null);
		lhs.add(89);
		System.out.println(lhs);

	}

}
