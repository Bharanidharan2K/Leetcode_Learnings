package com.Majority_Element;

public class Main {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));

	}
	public static int majorityElement(int[] nums) {
		int majority = nums[0];
		int count = 1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] == majority){
                count += 1;
            }
			else{
                count -= 1;
                if(count == 0){
                    majority = nums[i];
                    count = 1;
                }
            }
		}
		return majority;
	}
}
