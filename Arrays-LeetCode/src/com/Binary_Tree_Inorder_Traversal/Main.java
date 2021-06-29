package com.Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		TreeNode sec = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		head.left = sec;
		head.right = third;
		sec.left = fourth;
		sec.right = fifth;
		third.left = sixth;
		third.right = seventh;
		List<Integer> list = inorderTraversal(head);
		for(Integer i : list)
			System.out.print(i+" ");
		

	}
	public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode current_node = root;
        while(current_node != null || !stack.isEmpty()){
            while(current_node != null){
                stack.push(current_node);
                current_node = current_node.left;
            }
            current_node = stack.pop();
            list.add(current_node.val);
            current_node = current_node.right;
        }
        return list;
    }
}
