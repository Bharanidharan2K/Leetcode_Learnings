package com.Intersection_of_Two_Linked_Lists;

public class Main {

	public static void main(String[] args) {
		ListNode headA = new ListNode(4);
		ListNode secA = new ListNode(1);
		ListNode intersectPoint = new ListNode(8);
		ListNode fourthA = new ListNode(4);
		ListNode fifthA = new ListNode(5);
		headA.next = secA;
		secA.next = intersectPoint;
		intersectPoint.next = fourthA;
		fourthA.next = fifthA;
		ListNode headB = new ListNode(5);
		ListNode secB = new ListNode(6);
		ListNode thirdB = new ListNode(1);
		
		headB.next = secB;
		secB.next = thirdB;
		thirdB.next = intersectPoint;
		intersectPoint.next = fourthA;
		fourthA.next = fifthA;
		ListNode result = getIntersectionNode(headA, headB);
		System.out.println(result.val);
	}
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tempA = headA;
		ListNode tempB = headB;
		int l1 = 0, l2 = 0;
		while(tempA != null) {
			l1++;
			tempA = tempA.next;
		}
		while(tempB != null) {
			l2++;
			tempB = tempB.next;
		}
		tempA = headA;
		tempB = headB;
		if(l1 > l2) {
			for(int i = 0; i< (l1-l2); i++) {
				tempA = tempA.next;
			}
		}
		if(l2 > l1) {
			for(int i = 0; i< (l2-l1); i++) {
				tempB = tempB.next;
			}
		}
		
		while(tempA != null && tempB != null) {
			if(tempA == tempB) return tempA;
			tempA = tempA.next;
			tempB = tempB.next;
		}
		return null;
	}

}
