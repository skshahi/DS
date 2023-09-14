package com.ds.array.d2;

import java.util.Scanner;
import java.util.logging.Logger;


public class TwoDimentionalArray {
	int[][] arr;
	int row,col;
	Scanner s=new Scanner(System.in);
	private static final Logger logger = Logger.getLogger("TwoDimentionalArray.class"); 

	public TwoDimentionalArray(int row,int col) {
		this.row=row;
		this.col=col;
		arr=new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j]=Integer.MIN_VALUE;
				
			}		
			
		}
		
		
	}
	public void insertElementAtIndex(int rowIndex,int colIndex,int value)
	{
		try {
			if(arr[rowIndex][colIndex]==Integer.MIN_VALUE)
			{
				arr[rowIndex][colIndex]=value;
				System.out.println("Value Inserted successfully.");
			}else
			{
				System.out.println("This cell is already occupied!");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Array!!");
		}
	}
	public void insertValue() {
		int val=1;
		logger.info("lobd");
		logger.warning("fhgfhgd");
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter value for ["+i+"]["+j+"]:");
				val=s.nextInt();
				arr[i][j]=val;				
			}		
			
		}

		
	}
	
	//Access value based on indexes
	public void accessCell(int i, int j) {
	logger.info("Value at the cell ["+i+"]["+j+"]");
	try {
		logger.info(""+arr[i][j]);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		logger.info("Invalid Array");
	}
		
	}
	//Traversal of 2D array
	public void traversal2DArray()
	{
		System.out.println("Traversal of 2D Array:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] +" ");
				
			}
			
		}
		System.out.println("\n");
	}
	public void searchValue(int val) {
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(arr[i][j]==val)
				{
					System.out.println(val+" found at the cell ["+i+"]["+j+"]");
					return;
				}
		
				
			}
			
		}
		System.out.println(val+" is not present in array!");
	}
	public void deleteElement(int val) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(arr[i][j]==val)
				{
					arr[i][j]=Integer.MIN_VALUE;
					System.out.println(val+" deleted successfully!");
					return;
				}	
				
			}
			
		}
		System.out.println(val+" is not present in array!");
		
	}
	
	
	
	

}
