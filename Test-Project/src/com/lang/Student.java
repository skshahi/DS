package com.lang;

public class Student {
	
	String name;
	int rollno;
	
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public boolean equals(Object obj)
	{
		try
		{
			String name=this.name;
			int roll=this.rollno;
			
			Student s=(Student)obj;
			String name1=s.name;
			int rollno1=s.rollno;
			
			if(name.equals(name1)&&roll==rollno1)
			{
				return true;
			}else
			{
				return false;
			}
		}catch (ClassCastException e) {
			System.out.println("No class");
		}catch (NullPointerException e) {
			System.out.println("null object");
		}
		return false;
	}
	
	public int hashCode()
	{
		return this.rollno;
	}
	

	public static void main(String[] args) {
	Student s1=new Student("sonu", 10);
	Student s2=new Student("vivaan", 20);
	Student s3=new Student("sonu", 10);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	

	}

}
