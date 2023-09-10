package com.cerner;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}

}

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Student,String>f=s->{
			String grade="";
			int marks=s.marks;
			if(marks>80)
			{
				grade="A[Dictention]";
			}else if(marks>65)
			{
				grade="B[First class]";
			}else if(marks>50)
			{
				grade="C[Second class]";
			}else if(marks>30)
			{
				grade="D[Third class]";
			}else
			{
				grade="E[Fail]";
			}
			return grade;
			
		};
		Predicate<Student> p=s->s.marks>60;
		
	Student[] s= {new Student("Vivaan",100),
			new Student("ravi",75),
			new Student("raj",60),
			new Student("chiru",45),
			new Student("Sonu",25)
			
			};
	for(Student s1:s)
	{
		if(p.test(s1))
		{
		System.out.println("Student Name: "+s1.name);
		System.out.println("Student Mark: "+s1.marks);
		System.out.println("Student Name: "+f.apply(s1));
		System.out.println();
		}
	}

	}

}
