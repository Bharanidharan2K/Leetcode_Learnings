package com.Subset;

import java.util.ArrayList;
import java.util.List;

public class Main {
	//Backtracking method
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> result = subsets(nums);
		System.out.println(result);
	}
	static List<List<Integer>> result = new ArrayList<List<Integer>>();
    public static List<List<Integer>> subsets(int[] nums) {
        
        subsets(nums, 0, new ArrayList<Integer>());
        return result;
    }
    
    public static void subsets(int[] nums, int i, List<Integer> list) {
        
        if (i == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        list.add(nums[i]);
        subsets(nums, i+1, list);
        list.remove(list.size()-1);
        subsets(nums, i+1, list);
    }

}
