package com.Kth_Smallest_Element_in_a_BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode sec = new TreeNode(1);
		TreeNode third = new TreeNode(4);
		TreeNode fourth = new TreeNode(2);
		root.left = sec;
		root.right = third;
		sec.right = fourth;
		int k = 1;
		System.out.println(kthSmallest(root, k));
	}
	public static int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		TreeNode currentNode = root;
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			list.add(currentNode.val);
			currentNode = currentNode.right;
		}
		return list.get(k-1);
	}

}
