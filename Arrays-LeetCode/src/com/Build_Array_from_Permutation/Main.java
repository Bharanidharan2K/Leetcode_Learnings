package com.Build_Array_from_Permutation;

public class Main {
	public static void main(String[] args) {
		int nums[] = {0,2,1,5,3,4};
		int result[] = buildArray(nums);
		for(Integer i : result) {
			System.out.print(i+" ");
		}
	}
	public static int[] buildArray(int[] nums) {
		int result[] = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			result[i] = nums[nums[i]];
		}
		return result;
	}
}
