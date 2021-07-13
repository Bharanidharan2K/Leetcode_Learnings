package com.Kth_Largest_Element_in_an_Array;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int []nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(nums, k));

	}
	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		int length = nums.length-1;
		int res = 0;
		for(int i=length; i>length-k;i--) {
			res = nums[i];
		}
		return res;
	}
}
