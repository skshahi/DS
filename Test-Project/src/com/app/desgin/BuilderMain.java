package com.app.desgin;

public class BuilderMain {

	public static void main(String[] args) {
		
		 int x=0;
		
		Phone p=new BuilderDesignPattern().setOs("andriod").setProcessor("abc").getPhoneObject();
		System.out.println(p);

	}

}
