package com.app.java8;

import java.util.Arrays;
import java.util.Date;
import java.util.OptionalInt;

public class ReduceMethod {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,7,6,5,4};
		OptionalInt reduce = Arrays.stream(arr).reduce((prev,curr)->
		{
		      return Math.max(prev,curr);
		});
		
		System.out.println(reduce);
		
		Runtime r=Runtime.getRuntime();
		System.out.println(r.freeMemory());
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		
		for(int i=0;i<1000000;i++)
		{
			Date t=new Date();
			t=null;
		}
		r.gc();
		System.out.println("-------------------");
		System.out.println(r.freeMemory());
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		

	}

}
