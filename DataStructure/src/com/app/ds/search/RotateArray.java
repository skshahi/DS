package com.app.ds.search;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		int r=2;
		
		  while(r>0) { for(int i=0;i<a.length-1;i++ ) { int temp=a[i]; a[i]=a[i+1];
		  a[i+1]=temp; } r--; }
		 
		/*
		 * while(r>0) { for(int i=a.length-1;i>0;i--) { int temp=a[i]; a[i]=a[i-1];
		 * a[i-1]=temp; } r--; }
		 */
		
		System.out.println(Arrays.toString(a));

	}

}



//[7, 8, 1, 2, 3, 4, 5, 6]

//[3, 4, 5, 6, 7, 8, 1, 2]
