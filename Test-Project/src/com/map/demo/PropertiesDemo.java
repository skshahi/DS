package com.map.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
	
		Properties p =new Properties();
		FileInputStream fis=new FileInputStream("/Users/sk094067/workspace/abc.properties");
		p.load(fis);
		p.setProperty("vivaan", "shahi");
		System.out.println(p);
		
		System.out.println(p.getProperty("vivaan"));
		p.setProperty("atul", "shahi");
		FileOutputStream fileOutputStream=new FileOutputStream("/Users/sk094067/workspace/abc.properties");
		p.store(fileOutputStream, "Uploaded by Sonu");

	}

}
