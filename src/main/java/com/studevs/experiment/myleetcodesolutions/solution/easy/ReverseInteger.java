package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger implements Serializable {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int current = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + current;
        }
        return result;
    }
}
