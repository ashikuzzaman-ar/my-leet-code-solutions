package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.Stack;

/**
 * URL: https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList implements Serializable {
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

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
