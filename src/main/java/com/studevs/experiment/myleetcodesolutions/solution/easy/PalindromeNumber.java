package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber implements Serializable {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x < 10) {
			return true;
		}
		int temp = x, sum = 0;
		while (temp > 0) {
			sum = (sum * 10 + temp % 10);
			temp /= 10;
		}
		return sum == x;
	}
}
