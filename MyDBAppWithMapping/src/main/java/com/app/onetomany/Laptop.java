package com.app.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String name;
	/*
	 * @OneToMany private Student student;
	 */
	
	/*
	 * public Student getStudent() { return student; } public void
	 * setStudent(Student student) { this.student = student; }
	 */
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", name=" + name + "]";
	}
	
	

}
