package com.Majority_Element;

import java.util.HashMap;

public class Main1 {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));

	}
	public static int majorityElement(int[] nums) {
		int ans = nums[0];
		int count =0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			if(map.containsKey(i)) {
				count = Math.max(count, map.get(i));
				map.put(i, map.get(i)+1);
				if(map.get(i) > count) ans = i;
			}
			else {
				map.put(i, 1);
			}
		}
		return ans;
	}

}
