package com.Remove_Elements;

public class Main {

	public static void main(String[] args) {
		int []nums = {0,0,1,1,1,2,2,3,3,4};
		int val = 2;
		System.out.println(removeElement(nums, val));
	}
	public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}
