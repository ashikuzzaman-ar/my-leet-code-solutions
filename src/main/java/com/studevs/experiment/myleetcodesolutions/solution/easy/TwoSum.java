package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for two sum problem.
 * URL: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] numbs, int target) {
        int[] result = {0, 1};
        Map<Integer, Integer> indexMap = new HashMap<>(numbs.length);
        for (int i = 0; i < numbs.length; i++) {
            indexMap.put(numbs[i], i);
        }

        for (int i = 0; i < numbs.length; i++) {
            int first = numbs[i];
            int second = target - first;
            if (indexMap.get(second) != null && indexMap.get(second) != i) {
                result[0] = i;
                result[1] = indexMap.get(second);
                return result;
            }
        }
        return result;
    }
}
