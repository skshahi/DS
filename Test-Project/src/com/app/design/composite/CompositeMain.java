package com.app.design.composite;

public class CompositeMain {

	public static void main(String[] args) {
		Component  hd=new Leaf(8000, "HDD");
		Component  monitor=new Leaf(2000, "MONITOR");
		Component  ram=new Leaf(3000, "RAM");
		Component  mouse=new Leaf(500, "MOUSE");
		Component  cpu=new Leaf(9000, "CPU");
		
		Composite ph=new Composite("PERI");
		Composite mb=new Composite("MB");
		Composite computer=new Composite("COMPUTER");
		Composite cabinet=new Composite("CABINET");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();

	}

}
