package com.Two_sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = {1,2,3,4,5,6};
		int target = sc.nextInt();
		int result[] = twoSum(nums, target);
		System.out.print(result[0]+","+result[1]);
		sc.close();

	}
	public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i] + nums[j] == target){
                   a[0] = i;
                   a[1] = j;
               }
           }
       }
       return a;
   }

}
