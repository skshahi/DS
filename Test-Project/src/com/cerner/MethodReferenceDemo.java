package com.cerner;


interface Interf1
{
	public void add(int a,int b);
}

public class MethodReferenceDemo {
	
	public static void sum(int x,int y)
	{
		System.out.println("Total:"+(x+y));
	}

	public static void main(String[] args) {
		
		
		Interf1 i=(k,j)->System.out.println("The sum:"+(k+j));
		i.add(10, 20);
		
		Interf1 l=MethodReferenceDemo::sum;
		l.add(100, 200);
		/**
		 * Here functional interface add method referring   sum method of MethodReferenceDemo class
		 */
		

	}

}
