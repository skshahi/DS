package com.cerner;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		String str[]= {"sonu","ravi","avinash","chinmay","naresh"};
		Predicate<String> p=s->s.length()%2==0;
		for(String s:str)
		{
			if(p.test(s))
			{
				System.out.println(s);
			}
		}
		

	}

}
