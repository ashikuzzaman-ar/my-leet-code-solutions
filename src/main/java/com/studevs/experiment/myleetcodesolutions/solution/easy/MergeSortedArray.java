package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray implements Serializable {
    public void merge(int[] numbs1, int m, int[] numbs2, int n) {
        if (numbs1 == null || numbs1.length == 0 || numbs2 == null || numbs2.length == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(numbs2, 0, numbs1, 0, numbs2.length);
        } else {
            int[] temp = new int[m];
            System.arraycopy(numbs1, 0, temp, 0, m);
            int i = 0, i1 = 0, i2 = 0;
            while (i < numbs1.length) {
                if (i1 < temp.length && i2 < numbs2.length) {
                    numbs1[i++] = temp[i1] < numbs2[i2] ? temp[i1++] : numbs2[i2++];
                } else if (i1 == temp.length) {
                    numbs1[i++] = numbs2[i2++];
                } else {
                    numbs1[i++] = temp[i1++];
                }
            }
        }
    }
}
