package com.Median_of_Two_Sorted_Arrays;

public class Main {

	public static void main(String[] args) {
		int nums1 [] = {2};
		int nums2 [] = {};
		Double result = findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sum[] = new int[m+n];
        Double result = 0.0;
        for(int i=0;i<=m;i++){
            if(i == m){
                for(int j=i;j<(m+n);j++){
                	for(int k=0;k<nums2.length;k++)
                		sum[j++] = nums2[k];
                }
            }else {
            	sum[i] = nums1[i];
            }
        }
        for(int i=0;i<sum.length;i++){
            for(int j=i+1;j<sum.length;j++){
            	int tmp = 0;  
            	if (sum[i] > sum[j]) {  
	            	tmp = sum[i];  
	            	sum[i] = sum[j];  
	            	sum[j] = tmp;  
            	}  
            }
        }
        
        int halfthElement = (sum.length)/2;
        if(sum.length % 2 ==0){
        	Double firstPosition = Double.valueOf(sum[halfthElement-1]);
        	Double secondPosition = Double.valueOf(sum[halfthElement]);
            result = (firstPosition+secondPosition)/2;
        } 
        else{
            result = Double.valueOf(sum[halfthElement]);
        }
        return result;
    }
}
