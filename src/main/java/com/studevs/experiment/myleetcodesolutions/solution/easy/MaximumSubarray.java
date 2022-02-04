package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray implements Serializable {
	public int maxSubArray(int[] numbs) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int num : numbs) {
			sum += num;
			max = Math.max(sum, max);
			sum = Math.max(sum, 0);
		}
		return max;
	}
}
