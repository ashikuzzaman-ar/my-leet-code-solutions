package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/remove-element/
 */
public class RemoveElement implements Serializable {
	public int removeElement(int[] nums, int val) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index++] = nums[i];
			}
		}
		return index;
	}
}
