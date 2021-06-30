package com.Convert_Sorted_Array_to_Binary_Search_Tree;

public class Main {

	public static void main(String[] args) {
		int []nums = {-10,-3,0,5,9};
		TreeNode node = sortedArrayToBST(nums);
		System.out.println(node);
		//Use Debug to console the node...
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return constructTree(nums, 0, nums.length-1);
    }
	public static TreeNode constructTree(int []nums, int left, int right) {
		if(left > right) return null;
		int mid = left + (right - left) /2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructTree(nums, left, mid -1);
		root.right = constructTree(nums, mid + 1, right);
		return root;
	}
}
