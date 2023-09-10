package com.app.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class ThreadR extends Thread
{
	static ReentrantLock r=new ReentrantLock();
	ThreadR(String name)
	{
		super(name);
	}
	
	public void run()
	{
		
		do
		{
			try
			{
				if((r.tryLock(5000,TimeUnit.MILLISECONDS)))
				{
					System.out.println(Thread.currentThread().getName() +" got lock.");
					Thread.sleep(3000);
					r.unlock();
					System.out.println(Thread.currentThread().getName() +" releases lock.");
					break;
				}else
				{
					System.out.println(Thread.currentThread().getName() +" unable to get the lock.");

				}
				
			}catch (Exception e) {
				System.out.println("Vivaan");
			}
		}while(true);
		
	}
}

public class RecenterantLockDemo {

	public static void main(String[] args) {
		
		ThreadR t1=new ThreadR("First Thread");
		ThreadR t2=new ThreadR("Second Thread");
		t1.start();
		t2.start();

	}

}
