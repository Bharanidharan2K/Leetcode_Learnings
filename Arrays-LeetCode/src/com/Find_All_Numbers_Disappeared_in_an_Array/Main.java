package com.Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int index = Math.abs(nums[i]);
			if(nums[index - 1] > 0) {
				nums[index - 1] *= -1;
			}
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0) {
				list.add(i+1);
			}
		}
		return list;
	}

}
