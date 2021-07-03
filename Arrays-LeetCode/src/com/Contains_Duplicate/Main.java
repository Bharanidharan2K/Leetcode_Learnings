package com.Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(set.contains(i))return true;
            set.add(i);
        }
        
        return false;
	}

}
