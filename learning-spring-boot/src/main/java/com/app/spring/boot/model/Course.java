package com.app.spring.boot.model;

public class Course {
	
	private int id;
	private String  name;
	private String auther;
	public int getId() {
		return id;
	}
	
	
	public Course(int id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}


	public String getName() {
		return name;
	}
	public String getAuther() {
		return auther;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}
	
	
	

}
