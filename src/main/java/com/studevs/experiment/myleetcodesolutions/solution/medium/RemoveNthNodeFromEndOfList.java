package com.studevs.experiment.myleetcodesolutions.solution.medium;

import java.io.Serializable;
import java.util.Stack;

/**
 * URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList implements Serializable {
	
	public class ListNode {
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
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		Stack<Integer> stack = new Stack<>();
		while (head != null) {
			stack.add(head.val);
			head = head.next;
		}
		int count = 0;
		while (!stack.empty()) {
			Integer val = stack.pop();
			if (++count != n) {
				head = new ListNode(val, head);
			}
		}
		return head;
	}
}
