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
		int output_product[] = new int[n];
		output_product[0] = 1;
		for(int i= 1; i < n; i++) {
			output_product[i] = nums[i-1] * output_product[i-1];
		}
		int R = 1;
		for(int i = n-1; i >= 0; i--) {
			output_product[i] = output_product[i] * R;
			R = R * nums[i];
		}
		return output_product;
	}
}
