package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/single-number/
 */
public class SingleNumber implements Serializable {
    public int singleNumber(int[] numbs) {
        int result = 0;
        for (int numb : numbs) {
            result ^= numb;
        }
        return result;
    }
}
