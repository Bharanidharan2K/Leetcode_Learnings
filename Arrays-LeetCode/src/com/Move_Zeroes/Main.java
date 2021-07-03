package com.Move_Zeroes;

public class Main {

	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		moveZeroes(nums);
	}
	public static void moveZeroes(int[] nums) {
		int left = 0,right = 0;
		int n = nums.length;
		while(right < n) {
			if(nums[right] == 0) right++;
			else {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right++;
			}
		}
		for(Integer i : nums) {
			System.out.print(i+" ");
		}
	}

}
