package com.app.java8;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LimitDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,40,30,70,89,70);
		
		System.out.println(list);
		
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		Stream<Integer> limit = list.stream().sorted((i1,i2)->i1.compareTo(i2)).skip(1).limit(1);
		
	 Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 
		limit.forEach(System.out::println);
		
		Set<Integer> s=collect.keySet();
		for(Integer i:s)
		{
			System.out.println(i+"--"+collect.get(i));
		}
		s.forEach(System.out::println);
		
		collect.forEach((K,V) -> System.out.println(K + ", count : " + V));
		
		
		
		boolean anyMatch = list.stream().anyMatch(i->i>500);
		System.out.println(anyMatch);
		//List<Integer>list1=Arrays.asList(1);
		
		Integer i=list.stream().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Sonu"));
		System.out.println("second smallest element:"+i);
		
		
		
		//find common element between two array 
		Integer [] list1= {1,3,4,5,6};
		Integer []list2= {2,1,6,4,3};
List<Integer> collect2 = Arrays.stream(list1).filter(num1->Arrays.stream(list2).anyMatch(num2->num2==num1)).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		///reverse array
		
		Integer [] rev= {1,3,4,6,5};
		
		IntStream.range(0,rev.length/2).forEach(j->{
			int temp=rev[j];
			rev[j]=rev[rev.length-j-1];
			rev[rev.length-j-1]=temp;
			
			
		});
		System.out.println(Arrays.toString(rev));
		
		
		//find max length string from array
		
		String str[]= {"sonu","sabir","himanchu","chinmay"};
		int max = Arrays.stream(str).mapToInt(name->name.length()).max().orElse(0);
		System.out.println(max);
		
	}

}
