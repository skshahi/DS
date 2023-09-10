package com.app.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		Stream s=al.stream();
	

	}

}
