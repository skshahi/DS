package com.app.onetoone;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Alien {
	
	@Id
	@Column(columnDefinition = "VARCHAR(36)")
	@Type(type = "uuid-char")
	private UUID aid;
	private AlienName name;
	private String color;
	public UUID getAid() {
		return aid;
	}
	public void setAid(UUID aid) {
		this.aid = aid;
	}
	public AlienName getName() {
		return name;
	}
	public void setName(AlienName name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}
	
	

}
