package com.code;

public class ExceptionDemo {
	
	String str="ab";
	void m1()
	{
		try {
			str+="c";
			m2();
		} catch (Exception e) {
			str+="p";
			e.printStackTrace();
		}
	}

	private void m2() throws Exception {
		try
		{
			str+="d";
			m3();
		}catch(Exception e)
		{
			str+="l";
			throw new Exception();
		}
		finally
		{
			str+="e";
		}
		str+="m";
	}

	private void m3() throws Exception {
		throw new Exception();
		
	}
	
	void dis()
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		ExceptionDemo e=new ExceptionDemo();
		e.m1();
		e.dis();
		

	}

}
