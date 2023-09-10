package com.collection.demo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		
		Vector v=new Vector();
		System.out.println(v.capacity());
		System.out.println(v.size());
//		v.addElement(null);
//		v.addElement(null);
		for (int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);	
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			int i=(int) e.nextElement();
			
			
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
