package com.Reverse_Linked_List;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		ListNode reversedList = reverseList(head);
		while(reversedList != null) {
			System.out.print(reversedList.val+" ");
			reversedList = reversedList.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode newNode = head.next;
			head.next = prev;
			prev = head;
			head = newNode;
		}
		return prev;
	}

}
