package com.app.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50);
		
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		
		
		

	}

}
