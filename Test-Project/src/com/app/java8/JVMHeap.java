package com.app.java8;

public class JVMHeap {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.maxMemory()/(1024*1024));
		System.out.println(r.freeMemory()/(1024*1024));
		System.out.println(r.totalMemory()/(1024*1024));
		//System.out.println(r.()/(1024*1024));

	}

}
