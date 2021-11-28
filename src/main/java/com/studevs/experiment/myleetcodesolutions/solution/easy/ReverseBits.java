package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/reverse-bits/
 */
public class ReverseBits implements Serializable {
    public int reverseBits(int n) {
        int result = 0;
        String binaryString = Integer.toBinaryString(n);
        int i = binaryString.length();
        while (--i >= 0) {
            result = result * 2 + (binaryString.charAt(i) - '1' + 1);
        }
        return result << 32 - binaryString.length();
    }
}
