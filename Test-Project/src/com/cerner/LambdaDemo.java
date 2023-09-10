package com.cerner;

public class LambdaDemo {

	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("child thread");
		};
		Thread t=new Thread(r);
		t.start();
		System.out.println("main thread");

	}

}
