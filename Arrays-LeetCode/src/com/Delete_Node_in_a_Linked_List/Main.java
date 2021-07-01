package com.Delete_Node_in_a_Linked_List;

public class Main {

	public static void main(String[] args) {
		ListNode root = new ListNode(4);
		ListNode node = new ListNode(5);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(9);
		root.next = node;
		node.next = third;
		third.next = fourth;
		System.out.println("Before : ");
		ListNode current_node = root;
		while(current_node != null) {
			System.out.print(current_node.val);
			current_node = current_node.next;
		}
		System.out.println();
		deleteNode(node);
		System.out.println();
		ListNode current_node1 = root;
		while(current_node1 != null) {
			System.out.print(current_node1.val);
			current_node1 = current_node1.next;
		}
	}
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
        node.next = node.next.next;
	}

}
