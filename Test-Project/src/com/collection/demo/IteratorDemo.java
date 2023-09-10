package com.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		  ArrayList al=new ArrayList();
		  
		  for(int i=1;i<=10;i++)
		  {
			  al.add(i);
		  }
			/*
			 * al.add(null); al.add(null);
			 */
		  System.out.println(al.size());
		  System.out.println(al);
		  Iterator itr=al.iterator();
		  while(itr.hasNext())
		  {
			  int i=(int) itr.next();
			  System.out.println(i);
			  if(i==5)
			  itr.remove();
		  }
		  
		  System.out.println(al);
		  
		  

	}

}
