package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/reverse-string/
 */
public class ReverseString implements Serializable {
    public void reverseString(char[] s) {
        if (s.length < 2) {
            return;
        }
        int halfLength = s.length / 2;
        int lastIndex = s.length - 1;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            int indexFromLastSide = lastIndex - i;
            s[i] = s[indexFromLastSide];
            s[indexFromLastSide] = temp;
        }
    }
}
