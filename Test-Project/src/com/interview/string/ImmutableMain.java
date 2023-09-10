package com.interview.string;
//Rule to create immutable class
//1. class must final
//2. define a private final variable
//3. define public normal constructor





//--------------------------------------
/*
 * 
1. The class must be declared as final so that child classes can’t be created.
2. Data members in the class must be declared private so that direct access is not allowed.
3. Data members in the class must be declared as final so that we can’t change the value of it after object creation.
3. A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified
   with an object reference.
5. Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual 
   object reference)
*/

final class Immutable
{
	private final String name;
	public Immutable(String name)
	{
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	
	public Immutable getObject(String name)
	{
		if(this.name ==name)
		{
			return this;
		}else
		{
			return new Immutable(name);
		}
	}
}
public class ImmutableMain {

	public static void main(String[] args) {
		
		Immutable im1=new Immutable("sonu");
		Immutable im2=new Immutable("sonu");
		
		if(im1.getName()==im2.getName())
		{
			System.out.println("Immutable");
		}else
		{
			System.out.println("no");
		}
		
	}

}
