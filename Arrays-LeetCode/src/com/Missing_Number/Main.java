package com.Missing_Number;

public class Main {

	public static void main(String[] args) {
		int nums[] = {3,0,1,4};
		System.out.println(missingNumber(nums));

	}
	public static int missingNumber(int[] nums) {
		int sum = 0;
		for(Integer i : nums) 
			sum += i;
		int n = nums.length + 1;
		return (n*(n-1)/2) - sum;
	}
}
