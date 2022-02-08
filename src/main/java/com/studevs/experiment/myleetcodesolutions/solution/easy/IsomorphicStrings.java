package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * URL: https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings implements Serializable {
	public boolean isIsomorphic(String s, String t) {
		if (s == null || t == null || s.length() != t.length() || s.length() < 1 || s.length() > 50000) {
			return false;
		}
		Map<Character, Character> characterMap = new HashMap<>();
		Set<Character> characterSet = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char sC = s.charAt(i);
			char tC = t.charAt(i);
			
			Character mappedC = characterMap.get(sC);
			if (mappedC == null) {
				if (characterSet.contains(tC)) {
					return false;
				}
				characterMap.put(sC, tC);
				characterSet.add(tC);
				continue;
			}
			if (tC != mappedC) {
				return false;
			}
		}
		
		return true;
	}
}
