package com.Find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(nums));
	}
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			int index = Math.abs(nums[i]);
			if(nums[index - 1] > 0) {
				nums[index - 1] *= -1;
			}
			else {
				list.add(index-1 + 1);
			}
		}
		return list;
	}
}
