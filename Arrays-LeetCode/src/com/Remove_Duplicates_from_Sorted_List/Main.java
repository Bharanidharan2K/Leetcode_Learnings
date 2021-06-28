package com.Remove_Duplicates_from_Sorted_List;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode sec = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(2);
		ListNode fifth = new ListNode(3);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		head = deleteDuplicates(head);
		ListNode curr = head;
		while(curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}

	}
	public static ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while(current_node != null && current_node.next != null){
            if(current_node.val == current_node.next.val)
                current_node.next = current_node.next.next;
            else
                current_node = current_node.next;
        }
        return head;
    }
}
