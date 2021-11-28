package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/missing-number/
 */
public class MissingNumber implements Serializable {
    public int missingNumber(int[] numbs) {
        int sum = 0;
        for (int numb : numbs) {
            sum += numb;
        }
        return (numbs.length + (numbs.length * (numbs.length - 1)) / 2) - sum;
    }
}
