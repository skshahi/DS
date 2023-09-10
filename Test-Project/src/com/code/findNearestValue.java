package com.code;

public class findNearestValue {

	public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7,8,7,6,5,4};
	int v=4;
	int min=0;
	for(int i=0;i<arr.length;i++)
	{
		int temp=0;
		if(arr[i]<4)
		{
			temp=arr[i];
			
		}
		if(temp>min)
		{
			min=temp;
		}
	}
	System.out.println(min);

	}

}
