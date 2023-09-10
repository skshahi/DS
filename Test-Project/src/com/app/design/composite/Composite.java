package com.app.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	String name;
	
	List<Component> components=new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public void showPrice() {
		
		System.out.println(name);
		for(Component component:components)
		{
			component.showPrice();
		}
		
		
	}


	public void addComponent(Component component) {
		components.add(component);
		
	}

	

}
