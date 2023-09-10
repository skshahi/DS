package com.app.rest.web.services.versioning;

public class PersionV1 {
	
	private String name;

	public String getName() {
		return name;
	}

	public PersionV1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersionV1 [name=" + name + "]";
	}
	
	
	

}
