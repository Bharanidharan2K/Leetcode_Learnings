package com.Same_Tree;

public class Main {

	public static void main(String[] args) {
		// First Tree
		TreeNode p = new TreeNode(1);
		TreeNode secP = new TreeNode(2);
		TreeNode thirdP = new TreeNode(3);
		TreeNode fourthP = new TreeNode(4);
		p.left = secP;//				1
		p.right = thirdP;//			2		3
		secP.left = fourthP;//4
		//Second Tree
		TreeNode q = new TreeNode(1);
		TreeNode secQ = new TreeNode(2);
		TreeNode thirdQ = new TreeNode(3);
		TreeNode fourthQ = new TreeNode(4);
		q.left = secQ;//				1
		q.right = thirdQ;//			2		3
		secQ.left = fourthQ;//4
		System.out.println(isSameTree(p, q));
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}
