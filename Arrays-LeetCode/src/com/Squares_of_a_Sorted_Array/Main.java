package com.Squares_of_a_Sorted_Array;

public class Main {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int[] result = sortedSquares(nums);
		for(int i : result)System.out.print(i+" ");
	}
	public static int[] sortedSquares(int[] nums) {
		int p1 = 0, p2 = nums.length-1, last = nums.length-1;
		int[] result = new int[nums.length];
		while(p1 <= p2) {
			int tempLeft = nums[p1]*nums[p1];
			int tempRight = nums[p2]*nums[p2];
			if(tempLeft > tempRight) {
				result[last] = tempLeft;
				p1++;
			}else {
				result[last] = tempRight;
				p2--;
			}
			last--;
		}
		return result;
	}

}
