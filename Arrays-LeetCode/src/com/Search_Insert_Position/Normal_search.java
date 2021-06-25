package com.Search_Insert_Position;

public class Normal_search {
	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 2;
		System.out.println(searchInsert(nums, target));
	}
	public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
            
        }
        for(int i=0;i<nums.length;i++){
            if(target < nums[i]) return i;
        }
        return nums.length;
    }
}
