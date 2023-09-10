package com.app.thread;

class Thread11 extends Thread
{
	
	public Thread11(ThreadGroup tg,String name) {
		super(tg, name);
		
	}
	
	public void run()
	{
		System.out.println("Child Thread..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup tg1=new ThreadGroup("ParentGroup");
		ThreadGroup tg2=new ThreadGroup(tg1,"ChildGroup");
		Thread11 t1=new Thread11(tg1, "Vivvan");
		Thread11 t2=new Thread11(tg2, "Atul");
		t1.start();
		t2.start();
		System.out.println(tg1.activeCount());
		System.out.println(tg1.activeGroupCount());
		tg1.list();
		

	}

}
