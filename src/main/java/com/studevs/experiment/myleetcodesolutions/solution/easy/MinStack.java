package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/min-stack/
 */
public class MinStack implements Serializable {
	
	private static final class Node {
		private final Integer value;
		private final Integer min;
		private final Node next;
		
		public Node(Integer value, Integer min, Node next) {
			this.value = value;
			this.min = min;
			this.next = next;
		}
	}
	
	private Node head;
	
	public MinStack() {
	
	}
	
	public void push(int value) {
		this.head = new Node(value, this.head == null ? value : Math.min(value, this.head.min), this.head);
	}
	
	public void pop() {
		this.head = this.head.next;
	}
	
	public int top() {
		return this.head.value;
	}
	
	public int getMin() {
		return this.head.min;
	}
}
