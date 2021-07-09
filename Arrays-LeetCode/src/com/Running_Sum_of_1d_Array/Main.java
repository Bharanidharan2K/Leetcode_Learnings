package com.Running_Sum_of_1d_Array;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		int result[] = runningSum(nums);
		for(int i : result)
			System.out.print(i + " ");

	}
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		int result[] = new int[nums.length];
		for(int i = 0; i< nums.length; i++) {
			sum += nums[i];
			result[i] = sum;
		}
		return result;
	}

}
