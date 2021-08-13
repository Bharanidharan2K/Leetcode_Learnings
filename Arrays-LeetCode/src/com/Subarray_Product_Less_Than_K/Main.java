package com.Subarray_Product_Less_Than_K;

public class Main {

	public static void main(String[] args) {
		int[] nums = {10,5,2,6};
		int k =100;
		System.out.println(numSubarrayProductLessThanK(nums, k));
	}
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k <=1 )return 0;
		int count =0, product = 1, left =0;
		for(int i=0; i<nums.length; i++) {
			product *= nums[i];
			while(product >= k) {
				product /= nums[left];
				left++;
			}
			count += (i - left) +1;
		}
		return count;
	}

}
