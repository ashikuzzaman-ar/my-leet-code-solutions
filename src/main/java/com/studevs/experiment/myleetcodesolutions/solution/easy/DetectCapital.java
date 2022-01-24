package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/detect-capital/
 */
public class DetectCapital implements Serializable {
	
	public boolean detectCapitalUse(String word) {
		long count = word.chars().parallel().filter(i -> Character.isUpperCase((char) i)).count();
		return word.length() == count || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
	}
}
