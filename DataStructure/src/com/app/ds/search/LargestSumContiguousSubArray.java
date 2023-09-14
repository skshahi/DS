package com.app.ds.search;

public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		int[] arr= {1,-2,3,4,-4,6,-4,3,2};
		
		System.out.println("Max sub array sum:"+maxSubArraySum(arr));

	}

	private static int  maxSubArraySum(int[] arr) {
		
		
		
		int maxSoFor=0,maxEndingHere=0;
		for(int i=0;i<arr.length;i++)
		{
			maxEndingHere=maxEndingHere+arr[i];
			if(maxEndingHere<0)
			{
				maxEndingHere=0;
			}
			if(maxSoFor<maxEndingHere)
			{
				maxSoFor=maxEndingHere;
			}
		}
				
		
		return maxSoFor;
	}

}
