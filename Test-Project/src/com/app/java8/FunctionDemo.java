package com.app.java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i+9;
		System.out.println(f.apply(2));
		

	}

}
