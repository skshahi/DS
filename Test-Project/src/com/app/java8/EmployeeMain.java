package com.app.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

class Employee
{
	Integer id;
	String name;
	double salary;
	int age;
	public Employee(Integer id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee > al=new ArrayList<>();
		HashSet s=new HashSet<>();
		s.add(10);
		s.add(null);
		System.out.println("Sonu....."+s);
		LinkedList ll=new  LinkedList();
		Vector v=new Vector();
		Stack stack=new Stack();
		Queue queue=new LinkedList<>();
		
		TreeSet ts=new TreeSet();
		ts.add(10);
		//ts.add(null);
		
		ll.add(10);
		
		
		al.add(new Employee(1, "Sonu", 2000, 20));
		al.add(new Employee(20, "kalyan", 2000, 30));
		al.add(new Employee(10, "ravi", 2000, 24));
		al.add(new Employee(4, "sabir", 2000, 26));
		al.add(new Employee(5, "pramod", 2000, 40));
		al.add(new Employee(19, "vivaan", 2000, 10));
		al.add(new Employee(7, "himanshu", 2000, 50));
		al.add(new Employee(6, "chinmay", 2000, 29));
		al.add(new Employee(2, "abhishek", 2000, 70));
		al.add(new Employee(3, "sasi", 2000, 36));
		System.out.println(al.size());
		//sorting
		
		List<Employee> l=al.stream().filter(emp->emp.age>20 && emp.id%2==0).toList();
		Employee min=l.stream().min((emp1,emp2)->emp1.id.compareTo(emp2.id)).get();
		
		
		
		System.out.println(min+"\n\n");
		
		
		
		l.forEach(System.out::println);
		
		
		

	}

}
