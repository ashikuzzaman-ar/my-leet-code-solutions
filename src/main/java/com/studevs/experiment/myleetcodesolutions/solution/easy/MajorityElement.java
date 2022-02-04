package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/majority-element/
 */
public class MajorityElement implements Serializable {
    public int majorityElement(int[] numbs) {
        if (numbs.length == 1) {
            return numbs[0];
        }
        int majority = numbs[0];
        int count = 1;
        for (int i = 1; i < numbs.length; i++) {
            if (majority != numbs[i]) {
                count--;
            } else {
                count++;
                continue;
            }
            if (count == 0) {
                majority = numbs[i];
                count = 1;
            }
        }
        return majority;
    }
}
