package com.Count_Prime;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(countPrimes(n));

	}
	public static int countPrimes(int n) {
		boolean nums[] = new boolean[n];
		Arrays.fill(nums, true);
		for(int i = 2; i * i < n ;i++) {
			if(nums[i]) {
				for(int j = 2; j * i < n ;j++) {
					nums[j * i] = false;
				}
			}
		}
		int primeCount = 0;
		for(int i = 2; i < nums.length;i++) {
			if(nums[i]) primeCount ++;
		}
		return primeCount;
	}

}
