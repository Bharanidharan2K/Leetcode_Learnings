package com.Permutations;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> result = permute(nums);
		System.out.println(result);
		
		/* res = [ [1] ]
		 * res = [ [2  1] [1  2] ]
		 * res = [ [3 2 1] [2 3 1] [2 1 3] [3 1 2] [1 3 2] [1 2 3]  ]
		 * */

	}
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        res.get(0).add(nums[0]);
        for(int i=1; i<nums.length;i++) {
        	List<List<Integer>> newRes = new ArrayList<>();
        	for(List<Integer> current : res) {
        		for(int j=0 ; j<=current.size();j++) {
        			List<Integer> permutation = new ArrayList<>(current);
        			permutation.add(j, nums[i]);
        			newRes.add(permutation);
        		}
        	}
        	res = newRes;
        }
        return res;
    }

}
