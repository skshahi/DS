package com.app.ds.search;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OccurrenceDemo {

	public static void main(String[] args) {
		String input = "Testing om";
		String i=input.replace(" ", "");
		System.out.println(i);
		Map<String, Long> result = Arrays.stream(i.split(""))
		        .map(String::toLowerCase)
		        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(result);
		
		String str = "Testing";
		Pattern.compile(".").matcher(str)
		        .results()
		        .map(m -> m.group().toLowerCase())
		        .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
		        .forEach((k, v) -> System.out.println(k + " = " + v)); 


	}

}



