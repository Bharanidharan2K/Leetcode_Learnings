package com.Linked_List_Cycle;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(0);
		ListNode fourth = new ListNode(-4);
		// Pos = 1
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = sec;
		System.out.println(hasCycle(head));
	}
	public static boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) return true;
		}
		return false;
	}

}
