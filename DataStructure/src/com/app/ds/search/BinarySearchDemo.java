package com.app.ds.search;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[]a= {34,56,78,98,76,54,32,13,45,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int v=0;
		int l=0;int h=a.length-1;int m=(h+l)/2;
		while(l<=h)
		{
			if(a[m]==v)
			{
				System.out.println(v+" found at location "+m);
				
				return ;
				
			}else if(a[m]<v)
			{
				l=m+1;
				m=(h+l)/2;
				
				
			}else
			{
				h=m-1;
				m=(h+l)/2;
			}
		}
		
		System.out.println("No found");

	}

}
