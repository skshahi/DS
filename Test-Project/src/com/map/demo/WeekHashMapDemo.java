package com.map.demo;

import java.util.WeakHashMap;

class Temp
{

	@Override
	public String toString() {
		return "Temp";
	}
	
}
public class WeekHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
	//	HashMap hm=new HashMap();
	WeakHashMap hm=new WeakHashMap();
		Temp t=new Temp();
		hm.put(t, "sonu");
		System.out.println(hm);
		t=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(hm);
	

	}

}
