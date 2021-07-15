package com.Binary_Tree_Level_Order_Traversal;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode sec = new TreeNode(9);
		TreeNode third = new TreeNode(20);
		TreeNode fourth = new TreeNode(15);
		TreeNode fifth = new TreeNode(7);
		root.left = sec;
		root.right = third;
		third.left = fourth;
		third.right = fifth;
		List<List<Integer>> list = levelOrder(root);
		System.out.println(list);
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if(root == null) return list;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int n = queue.size();
			List<Integer> current_list = new ArrayList<>();
			for(int i=0; i<n; i++) {
				TreeNode current = queue.remove();
				current_list.add(current.val);
				if(current.left != null) queue.add(current.left);
				if(current.right != null) queue.add(current.right);
			}
			list.add(current_list);
		}
		return list;
	}

}
