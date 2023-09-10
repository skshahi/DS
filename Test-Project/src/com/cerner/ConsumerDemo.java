package com.cerner;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student1 {
	String name;
	int marks;

	public Student1(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}

}
public class ConsumerDemo {

	public static void main(String[] args) {

		Function<Student1, String> f = s -> {
			String grade = "";
			int marks = s.marks;
			if (marks > 80) {
				grade = "A[Dictention]";
			} else if (marks > 65) {
				grade = "B[First class]";
			} else if (marks > 50) {
				grade = "C[Second class]";
			} else if (marks > 30) {
				grade = "D[Third class]";
			} else {
				grade = "E[Fail]";
			}
			return grade;

		};
		Predicate<Student1> p = s -> s.marks > 60;
		Consumer<Student1> c=s1->
		{
			System.out.println("Student Name: " + s1.name);
			System.out.println("Student Mark: " + s1.marks);
			System.out.println("Student Grade: " + f.apply(s1));
			System.out.println();
		};

		Student1[] s = { new Student1("Vivaan", 100), new Student1("ravi", 75), new Student1("raj", 70),
				new Student1("chiru", 45), new Student1("Sonu", 25)

		};
		for (Student1 s1 : s) {
			if (p.test(s1)) {
				c.accept(s1);
			}
		}

	}

}
