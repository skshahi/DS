package com.app.desgin.adapter;

public class AdapterDesignPattern implements Pen {
	
	
	PilotPen pp=new PilotPen();

	@Override
	public void write(String str) {
		pp.works(str);
		
	}

}
