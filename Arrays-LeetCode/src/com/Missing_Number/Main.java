package com.Missing_Number;

public class Main {

	public static void main(String[] args) {
		int nums[] = {3,0,1,4};
		System.out.println(missingNumber(nums));

	}
	public static int missingNumber(int[] nums) {
		int xor = nums.length;
		for(int i=0;i<nums.length;i++) {
			xor ^= i^nums[i];
		}
		return xor;
	}

}
