package com.studevs.experiment.myleetcodesolutions.solution.medium;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater implements Serializable {
	public int maxArea(int[] height) {
		int max = 0, front = 0, rear = height.length - 1;
		do {
			max = Math.max(max, (rear - front) * Math.min(height[front], height[rear]));
			if (height[front] < height[rear]) front++;
			else rear--;
		} while (front < rear);
		return max;
	}
}
