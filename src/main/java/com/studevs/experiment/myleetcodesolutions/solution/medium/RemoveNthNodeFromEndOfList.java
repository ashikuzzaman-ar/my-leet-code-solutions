package com.studevs.experiment.myleetcodesolutions.solution.medium;

import java.io.Serializable;

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
		return this.revertAndRemove(this.revert(head), n);
	}
	
	private ListNode revertAndRemove(ListNode current, int n) {
		ListNode head = null;
		while (current != null) {
			ListNode temp = current;
			current = current.next;
			if (--n != 0) {
				temp.next = head;
				head = temp;
			}
		}
		return head;
	}
	
	private ListNode revert(ListNode current) {
		ListNode head = null;
		while (current != null) {
			ListNode temp = current;
			current = current.next;
			temp.next = head;
			head = temp;
		}
		return head;
	}
}
