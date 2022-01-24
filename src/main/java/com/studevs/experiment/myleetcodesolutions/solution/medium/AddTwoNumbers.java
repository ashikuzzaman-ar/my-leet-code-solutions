package com.studevs.experiment.myleetcodesolutions.solution.medium;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers implements Serializable {
	
	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode() {
		}
		
		ListNode(int val) {
			this.val = val;
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0), current = head;
		int carry = 0;
		while (l1 != null || l2 != null || carry > 0) {
			int l1Val = 0;
			if (l1 != null) {
				l1Val = l1.val;
				l1 = l1.next;
			}
			int l2Val = 0;
			if (l2 != null) {
				l2Val = l2.val;
				l2 = l2.next;
			}
			int sum = l1Val + l2Val + carry;
			carry = sum / 10;
			current.next = new ListNode(sum % 10, null);
			current = current.next;
		}
		return head.next;
	}
}
