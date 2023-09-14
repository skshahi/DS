package com.ds.array;

public class Main {

	public static void main(String[] args) {
		SingleDimentionalArray singleDimentionalArray=new SingleDimentionalArray(3);
		/*
		 * singleDimentionalArray.insert(0, 10); singleDimentionalArray.insert(1, 20);
		 * singleDimentionalArray.insert(2, 30);
		 */
		//singleDimentionalArray.insert(3, 40);		
		//singleDimentionalArray.insert(1, 50);
		System.out.println("Array Traversal");
		singleDimentionalArray.arraytraversal();
		System.out.println("\nSearch Operation.");
		singleDimentionalArray.searchElement(100);
		System.out.println("Delete Operation");
		singleDimentionalArray.deleteElement(10);
		singleDimentionalArray.arraytraversal();
		
	}

}
