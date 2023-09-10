package com.cerner;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1, "Sonu"));
		al.add(new Employee(3, "vivaan"));
		al.add(new Employee(6, "raj"));
		al.add(new Employee(2, "jay"));
		al.add(new Employee(3, "vivaan"));
		System.out.println(al);
		
		//Collections.sort(al,(e1,e2)->(e1.id>e2.id?-1:(e1.id<e2.id?1:0)));
		Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(al);

	}

}
