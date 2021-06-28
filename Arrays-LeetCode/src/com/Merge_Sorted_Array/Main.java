package com.Merge_Sorted_Array;

public class Main {

	public static void main(String[] args) {
		// Values in the array must be non-decreasing order
		int nums1[] = {2,2,3,0,0,0};
		int m = 3;
		int nums2[] = {1,5,6};
		int n = 3;
		merge(nums1, m, nums2, n);
		
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int length = nums1.length - 1;
		m = m - 1; n = n - 1;
		while(n>=0 && m>=0) {
			if(nums1[m] > nums2[n]) {
				nums1[length] = nums1[m];
				m -= 1;
			}
			else {
				nums1[length] = nums2[n];
				n -= 1;
			}
			length --;
		}
		while(n >=0) {
			nums1[length] = nums2[n];
			n -= 1;
			length --;
		}
		
		for(Integer i : nums1)
			System.out.print(i+" ");
	}
}
