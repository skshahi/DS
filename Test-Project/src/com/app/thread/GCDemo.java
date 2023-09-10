package com.app.thread;

public class GCDemo {

	public static void main(String[] args) {
		
		GCDemo t=new GCDemo();
		//t.finalize();
		t=null;
		System.gc();
		System.out.println("Main");
	

	}
	
	public void finalize()
	{
		
		System.out.println("finalize method..");
		System.out.println(10/0);
		
	}

}
