package com.app.thread;


class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child Thread...");
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.State.NEW);
		//System.out.println(Thread.currentThread().countStackFrames());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.currentThread().hashCode());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().getStackTrace());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().activeCount());
		System.out.println(Thread.currentThread());
		MyThread.t=Thread.currentThread();
		MyThread t=new MyThread();
		//t.join();
		t.start();
	//	t.join();
		System.out.println("------------");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.State.NEW);
		//System.out.println(Thread.currentThread().countStackFrames());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.currentThread().hashCode());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().getStackTrace());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().activeCount());
		System.out.println(Thread.currentThread());
		

	}

}
