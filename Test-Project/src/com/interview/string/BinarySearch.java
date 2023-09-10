package com.interview.string;

public class BinarySearch {
	public static int search(int []arr,int n)
	{
		int l=0;
		int h=arr.length;
		int mid=(l+h)/2;
		while(l<=h)
		{
			if(arr[mid]==n)
			{
				return mid;
			}else if(n>arr[mid])
			{
				l=mid;
				h=arr.length;
				mid=(l+h)/2;
			}else
			{
				l=0;
				h=mid;
				mid=(l+h)/2;
			}
		}
		
		return -1;
	}
	
	public static int maxOfNum(int[] arr,int n)
	{
		int index=search(arr, n);
		int count=0;
		for(int i=index+1;i<arr.length;i++)
		{
			if(arr[i]>n)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[]arr= {2,3,4,5,6,7,8};
		System.out.println(maxOfNum(arr,5));
		
		

	}

}
