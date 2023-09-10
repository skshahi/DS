package com.app.exception;


class CustomException1 extends RuntimeException
{
	CustomException1(String s)
	{
		super(s);
	}
}

class CustomException2 extends RuntimeException
{
	CustomException2(String s)
	{
		super(s);
	}
}
public class CustomizedExceptionDemo {

	public static void main(String[] args) {
		

		if(10>20)
		{
			throw new CustomException1("This is Custom exception!!!!");
		}else
		{
			//System.out.println(Math.mod(Math.sqrt(24)));
			
			System.out.println(Math.floor(Math.sqrt(24)));
			throw new CustomException2("Hello Sonu ,this is custom!!");
		}
	}

}
