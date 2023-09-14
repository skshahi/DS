package com.app.ds.search;
//create a class to perform wait and notify function
class Utility
{
	int i;
	
	boolean flag=false;
	
	public synchronized void set(int i)
	{
		while(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.i=i;
		flag=true;
		System.out.println("Produce:"+i);
		notify();
	}
	
	public synchronized void get()
	{
		while(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		flag=false;
		System.out.println("Consume:"+i);
		notify();
	}
	
}
//create a class to consume the value
class Consumer extends Thread 
{
	private Utility utility;

	public Consumer(Utility utility) {
	
		this.utility = utility;
		
		Thread t=new Thread(this,"Consumer");
		t.start();
		
	}
	
	public void run()
	{
		while(true)
		{
			utility.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}
	
	
}
//create a class to produce the value
class Producer extends Thread
{
	private Utility utility;
	public Producer(Utility utility) {
		this.utility=utility;
		

		Thread t=new Thread(this,"Consumer");
		t.start();
		
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			utility.set(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}
}

//create a main class to run the producer and consumer class
public class ProcedureConsumer {

	public static void main(String[] args) {
		
		Utility u=new Utility();
		new Producer(u);
		new Consumer(u);
		

	}

}
