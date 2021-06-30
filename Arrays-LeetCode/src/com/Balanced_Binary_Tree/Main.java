package com.Balanced_Binary_Tree;

public class Main {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		TreeNode sec = new TreeNode(9);
		TreeNode third = new TreeNode(20);
		TreeNode fourth = new TreeNode();
		TreeNode fifth = new TreeNode();
		TreeNode sixth = new TreeNode(15);
		TreeNode seventh = new TreeNode(7);
		node.left = sec;
		node.right = third;
		sec.left = fourth;
		sec.right = fifth;
		third.left = sixth;
		third.right = seventh;
		
		System.out.println(isBalanced(node));

	}
	public static boolean isBalanced(TreeNode root) {
		if(root == null) return true;
		int leftSize = maxHeight(root.left);
		int rightSize = maxHeight(root.right);
		return (Math.abs(rightSize - leftSize) <= 1 && isBalanced(root.left) && isBalanced(root.right));
	}
	public static int maxHeight(TreeNode root) {
		if(root == null) return 0;
		return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
	}
}
