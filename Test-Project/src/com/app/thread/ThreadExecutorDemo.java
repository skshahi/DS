package com.app.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThreadDemo implements Callable
{

	int i=10;
	
	public MyThreadDemo(int i) {
		super();
		this.i = i;
	}

	@Override
	public Object call() throws Exception {
		
		int sum=0;
		for(int j=0;j<=i;j++)
		{
			sum+=j;
		}
		if(sum%2==0)
		{
			System.out.println("Even Sum:"+sum);
		return i;
		}else
		{
			System.out.println("Odd Sum:"+sum);
			return -1;
		}
	}
	
}

public class ThreadExecutorDemo {

	public static void main(String[] args) {
		MyThreadDemo jobs[]= {new MyThreadDemo(3),
				new MyThreadDemo(6),
				new MyThreadDemo(8),
				new MyThreadDemo(2),
				new MyThreadDemo(9),
				new MyThreadDemo(7)
				
		};
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		for(MyThreadDemo t:jobs)
		{
			Future submit = newFixedThreadPool.submit(t);
			try {
				Object object = submit.get();
				
				
				System.out.println(object);
			} catch (InterruptedException | ExecutionException e) {
				
				e.printStackTrace();
			}
		}
		newFixedThreadPool.shutdown();
		

	}

}
