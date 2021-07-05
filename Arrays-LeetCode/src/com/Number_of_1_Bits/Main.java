package com.Number_of_1_Bits;

public class Main {

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));

	}
	public static int hammingWeight(int n) {
		int count = 0;
		for(int i=0;i<Integer.SIZE;i++) {
			count += (n & 1);
			n = n >> 1;
		}
		return count;
	}
}
