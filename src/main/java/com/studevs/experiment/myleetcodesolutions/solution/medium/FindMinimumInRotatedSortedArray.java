package com.studevs.experiment.myleetcodesolutions.solution.medium;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimumInRotatedSortedArray implements Serializable {
	public int findMin(int[] nums) {
		int front = nums.length - 1;
		if (nums.length == 1 || nums[0] < nums[front]) return nums[0];
		int rear = 0, mid = (rear + front) / 2;
		while (rear < front) {
			mid = (rear + front) / 2;
			if (rear == mid) return Math.min(nums[rear], nums[front]);
			else if (nums[mid] >= nums[rear] && nums[rear] > nums[front]) rear = mid + 1;
			else front = mid;
		}
		return nums[rear];
	}
}
