package com.cerner;

public class AnonymousDemo {

	public static void main(String[] args) {
		
		Runnable r=new Runnable()
				{

					@Override
					public void run() {
						System.out.println("Child Thread");
						
					}
			
				};
				Thread t=new Thread(r);
				t.start();
				System.out.println("Main Thread");

	}

}
