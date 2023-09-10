package com.app.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(25,67,87,90,87,65,34,56,7);
		
		Map<Integer, Long> collect = al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		HashSet hs=new HashSet<>();
		al.stream().filter(h->!hs.add(h)).forEach(System.out::println);
		
		
		
		

	}

}
