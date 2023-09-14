package com.ds.array;

public class SingleDimentionalArray {
	
	int arr[];

	public SingleDimentionalArray(int size) {
		arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.MIN_VALUE;
			
		}
		
		
	}
	
	public void insert(int index ,int value)
	{
		try {
			if(arr[index]==Integer.MIN_VALUE)
			{
				arr[index]=value;
				System.out.println("Value successfully inserted in Array.");
			}else
			{
				System.out.println("Index "+index +" is already have value.");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index!!");
			
		}
	}

	public void arraytraversal() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
				
			}
			
		} catch (Exception e) {
		System.out.println("Array does not exist!!");
		}
		
	}

	public void searchElement(int i) {
		for (int j = 0; j < arr.length; j++) {
			
			if(arr[j]==i) {
				System.out.println("Value found at index of :"+j);
				return ;
			}
		}
		System.out.println(i+ " is not found in Array.");
		
	}

	public void deleteElement(int val) {
		try {
			boolean b=false;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==val)
				{
					arr[j]=Integer.MIN_VALUE;
					b=true;
					System.out.println(val+ " deleted successfully");
					
				}
				
			}
			if(b==false)
			{
				System.out.println(val+" does not exist in Array to peform delete operation!");
			}
		} catch (Exception e) {
		System.out.println("Array is Empty");
		}
		
	}
	
	

}
