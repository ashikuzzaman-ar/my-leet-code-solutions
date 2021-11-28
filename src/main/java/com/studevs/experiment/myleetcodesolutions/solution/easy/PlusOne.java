package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.Arrays;

/**
 * URL: https://leetcode.com/problems/plus-one/
 */
public class PlusOne implements Serializable {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        System.arraycopy(digits, 0, result, 1, digits.length);
        int index = result.length;
        while (--index >= 0) {
            result[index]++;
            if (result[index] < 10) {
                break;
            } else {
                result[index] %= 10;
            }
        }
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }
}
