package com.Single_Number;

public class Main {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
		

	}
	public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}
