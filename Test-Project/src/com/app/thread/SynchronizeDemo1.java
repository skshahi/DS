package com.app.thread;


class Display
{
	synchronized public void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good Morning "+name);
		}
	}
}

class MyThread1 extends Thread
{
	Display d;
	String name;
	
	public MyThread1(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public void run ()
	{
		d.wish(name);
		
	}
}

public class SynchronizeDemo1 {

	public static void main(String[] args) {
		Display  d=new Display();
		
		MyThread1 t1=new MyThread1(d, "Sonu");
		MyThread1 t2=new MyThread1(d, "Vivaan");
		
		
		
		t1.start();
		
		t2.start();
		

	}

}
