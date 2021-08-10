package com.sort_color;

public class Main {

	public static void main(String[] args) {
		int nums[] = {2,0,2,1,1,0};
		sortColors(nums);
	}
	public static void sortColors(int[] nums) {
		int l = 0, m = 0, h = nums.length-1;
		while(m <= h) {
			if(nums[m] == 0) {
				swap(nums, l, m);
				l++;
				m++;
			}
			else if(nums[m] == 1) m++;
			else {
				swap(nums, m, h);
				h--;
			}
		}
		print(nums);
	}
	private static void swap(int []nums, int left, int rigth) {
		int temp = nums[left];
		nums[left] = nums[rigth];
		nums[rigth] = temp;
		
	}
	private static void print(int nums[]){
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
