package com.app.jpa.hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String name;
	private String auther;
	public Course(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}
	

}
