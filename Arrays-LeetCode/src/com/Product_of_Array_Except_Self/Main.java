package com.Product_of_Array_Except_Self;

public class Main {

	public static void main(String[] args) {
		int []nums = {1,2,3,4};
		int result [] = productExceptSelf(nums);
		for(int i : result)
			System.out.print(i + " ");
	}
	public static int[] productExceptSelf(int[] nums) {
		int n =  nums.length;
		int left_product[] = new int[n];
		int right_product[] = new int[n];
		int output_product[] = new int[n];
		left_product[0] = 1;
		right_product[n-1] = 1;
		for(int i = 1; i < n; i++) {
			left_product[i] = nums[i-1] * left_product[i-1];
		}
		for(int i = n-2; i >= 0; i--) {
			right_product[i] = nums[i+1] * right_product[i+1];
		}
		for(int i = 0; i < n; i++) {
			output_product[i] = left_product[i] * right_product[i];
		}
		return output_product;
	}
}
