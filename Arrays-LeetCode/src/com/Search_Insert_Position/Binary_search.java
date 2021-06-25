package com.Search_Insert_Position;

public class Binary_search {

	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 7;
		System.out.println(searchInsert(nums, target));

	}
	public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l <= r) {
        	int mid = l+r / 2;
        	if(nums[mid] == target) return mid;
        	if(nums[mid] > target) r = mid -1;
        	else l = mid + 1;
        }
        return l;
    }
}
