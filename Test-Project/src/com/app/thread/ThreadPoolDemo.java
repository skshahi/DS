package com.app.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyJob implements Runnable
{
	private String name;
	
	
	

	public MyJob(String name) {
		
		this.name = name;
	}




	@Override
	public void run() {
		System.out.println(name +"...Job started by Thread "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println(name +"...Job completed by Thread "+Thread.currentThread().getName());
		
	}
	
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		MyJob[] myJobs= {
		new MyJob("Wish job"),
		new MyJob("Alert job"),
		new MyJob("Check job"),
		new MyJob("Sale job"),
		new MyJob("Verify job"),
		new MyJob("Inform job"),
		};
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		for(MyJob job:myJobs)
		{
			newFixedThreadPool.submit(job);
		}
		newFixedThreadPool.shutdown();

	}

}
