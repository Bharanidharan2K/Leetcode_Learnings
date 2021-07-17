package com.Concatenation_of_Array;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,2,1};
		int res[] = getConcatenation(nums);
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
	public static int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int res[] = new int[2*n];
		for(int i=0, j=0;i<res.length; i++) {
			if(i >= n && j < n) {
				res[i] = nums[j++];
			}
			else {
				res[i] = nums[i];
			}
		}
		return res;
	}

}
