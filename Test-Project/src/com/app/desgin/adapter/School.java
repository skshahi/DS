package com.app.desgin.adapter;

public class School {

	public static void main(String[] args) {
		Pen pp=new AdapterDesignPattern();
		AssignmentWork aw=new AssignmentWork();
		aw.setP(pp);
		aw.writeAssignment("I am writting assignment...");

	}

}
