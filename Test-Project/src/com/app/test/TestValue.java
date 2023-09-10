package com.app.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestValue {
public static void main(String[] args) throws ParseException {
	LocalDateTime ld=LocalDateTime.now();
	System.out.println(ld);
	System.out.println(LocalDateTime.now());
	System.out.println(new Date());
	/*
	 * Instant i=Instant.parse("2023-07-03 16:06:58"); System.out.println(i);
	 */
	//Date d=Date.
	//String date="2023-07-03 16:06:58";
	


	/*
	 * String date = "2017-03-08 12:30:54"; DateTimeFormatter format =
	 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); LocalDateTime dateTime =
	 * LocalDateTime.parse(date, format); System.out.println(dateTime);
	 */
	
	/*
	 * String dateTime="2014-05-05 03:23:50"; DateFormat formatter=new
	 * SimpleDateFormat("yyyy-mm-dd HH:mm:ss"); Date date=formatter.parse(dateTime);
	 * System.out.println(date);
	 */
	
	String start_dt = "2011-01-31 17:06:45";

	DateFormat parser = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
	Date date = (Date) parser.parse(start_dt);
	System.out.println(date);

	DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss"); 
	System.out.println(formatter.format(date));
	
	
	

	
	
}

}
