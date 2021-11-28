package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram implements Serializable {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            map.put(key, map.getOrDefault(key, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
