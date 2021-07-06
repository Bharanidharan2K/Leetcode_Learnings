package com.Happy_Number;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int n = 29;
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while(n != 1) {
			int sum = 0;
			int current = n;
			while(current != 0) {
				sum += (current % 10) * (current % 10);
				current /= 10;
			}
			if(set.contains(sum)) return false;
			set.add(sum);
			n = sum;
		}
		return true;
	}

}
