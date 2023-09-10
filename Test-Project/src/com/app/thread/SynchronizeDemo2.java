package com.app.thread;
class Wish
{
	public synchronized void morningWish()
	
	{
		System.out.println("Good morning");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			

			e.printStackTrace();
		}
	}
	
	
	public synchronized void noonWish()
	
	{
		System.out.println("Good After noon");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

class Thread1 extends Thread
{
	Wish w;

	public Thread1(Wish w) {
		super();
		this.w = w;
	}
	
	public void run()
	{
		w.morningWish();
	}
	
}

class Thread2 extends Thread
{
	Wish w;

	public Thread2(Wish w) {
		super();
		this.w = w;
	}
	
	public void run()
	{
		w.noonWish();
	}
	
}
public class SynchronizeDemo2 {

	public static void main(String[] args) {
		Wish w=new Wish();
		
		Thread1 t1=new Thread1(w);
		Thread2 t2=new Thread2(w);
		
		t1.start();
		t2.start();

	}

}
