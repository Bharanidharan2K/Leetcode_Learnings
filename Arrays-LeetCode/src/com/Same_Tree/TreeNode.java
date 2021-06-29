package com.Same_Tree;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	public TreeNode(int val) {this.val = val;}
	public TreeNode(TreeNode left, TreeNode right, int val) {
		super();
		this.left = left;
		this.right = right;
		this.val = val;
	}
}
