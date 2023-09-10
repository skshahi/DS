package com.app.desgin;

public class BuilderDesignPattern {
	
	private String os;
	private String processor;
	private double screenSize;
	
	
	
	public BuilderDesignPattern setOs(String os) {
		this.os = os;
		return this;
	}
	public BuilderDesignPattern setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public BuilderDesignPattern setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone getPhoneObject()
	{
		return new Phone(os, processor, screenSize);
	}

}
