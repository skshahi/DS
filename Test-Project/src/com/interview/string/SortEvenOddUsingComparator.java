package com.interview.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Given a sequence of rank you have to sort the even rank first and odd rank last using comparator
public class SortEvenOddUsingComparator {

	public static void main(String[] args) {
		int[]arr= {1,4,6,2,5,3};
		
		ArrayList even=new ArrayList();
		ArrayList odd=new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}else
			{
				odd.add(arr[i]);
			}
		}
		
	//	System.out.println(even);
		//System.out.println(odd);
		Comparator<Integer> c=(i,j)->{
			return i>j?1:i<j?-1:0;
			
		};
		Comparator<Integer> c1=(i,j)->{
			return i>j?1:i<j?-1:0;
			
		};
		Collections.sort(odd,c1);
		Collections.sort(even,c);
		/*
		 * System.out.println(even); System.out.println(odd);
		 */
		int j=0;
		for(int i=0;i<even.size()+odd.size();i++)
		{
			if(i<even.size())
			{
				//System.out.println(i);
				arr[i]=(int) even.get(i);
			}else
			{
				//System.out.println(i);
				arr[i]=(int) odd.get(j);
				j++;
			}
		}
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
				

	}

}
