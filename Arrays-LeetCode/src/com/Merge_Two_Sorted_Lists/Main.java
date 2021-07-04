package com.Merge_Two_Sorted_Lists;

public class Main {

	public static void main(String[] args) {
		ListNode l1Head = new ListNode(1);
		ListNode l1Sec = new ListNode(2);
		ListNode l1Third = new ListNode(4);
		ListNode l2Head = new ListNode(1);
		ListNode l2Sec = new ListNode(3);
		ListNode l2Third = new ListNode(4);
		l1Head.next = l1Sec;
		l1Sec.next = l1Third;
		
		l2Head.next = l2Sec;
		l2Sec.next = l2Third;

		ListNode sortedNode = mergeTwoLists(l1Head, l2Head);
		while(sortedNode != null) {
			System.out.print(sortedNode.val+" ");
			sortedNode = sortedNode.next;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyNode = new ListNode();
		ListNode currentNode = dummyNode;
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				currentNode.next = l1;
				l1 = l1.next;
			}
			else {
				currentNode.next = l2;
				l2 = l2.next;
			}
			currentNode = currentNode.next;
		}
		if(l1 != null) currentNode.next = l1;
		if(l2 != null) currentNode.next = l2;
		
		return dummyNode.next;
	}
}
