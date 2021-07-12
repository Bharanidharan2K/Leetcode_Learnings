package com.Subset;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> result = subsets(nums);
		System.out.println(result);

	}
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<Integer>());
		
		for(int x : nums) {
			int n = result.size();
			for(int i=0;i<n;i++) {
				ArrayList<Integer> subset = new ArrayList<>(result.get(i));
				subset.add(x);
				result.add(subset);
			}
		}
		return result;
	}

}
