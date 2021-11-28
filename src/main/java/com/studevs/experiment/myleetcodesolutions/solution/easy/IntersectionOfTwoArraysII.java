package com.studevs.experiment.myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArraysII implements Serializable {
    private static class ResultMatrix {
        private int leftCount;
        private int rightCount;

        public ResultMatrix(int leftCount, int rightCount) {
            this.leftCount = leftCount;
            this.rightCount = rightCount;
        }
    }

    public int[] intersect(int[] numberArray1, int[] numberArray2) {
        boolean isNumberArray1Smaller = numberArray1.length < numberArray2.length;
        int[] smallerNumbers = isNumberArray1Smaller ? numberArray1 : numberArray2;
        int[] biggerNumbers = isNumberArray1Smaller ? numberArray2 : numberArray1;
        Map<Integer, ResultMatrix> resultMap = new HashMap<>(smallerNumbers.length);

        for (int number : smallerNumbers) {
            ResultMatrix resultMatrix = resultMap.get(number);
            if (resultMatrix == null) {
                resultMap.put(number, new ResultMatrix(1, 0));
            } else {
                resultMatrix.leftCount++;
            }
        }

        for (int number : biggerNumbers) {
            ResultMatrix resultMatrix = resultMap.get(number);
            if (resultMatrix != null) {
                resultMatrix.rightCount++;
            }
        }

        int[] result = new int[smallerNumbers.length];
        int index = -1;
        for (Map.Entry<Integer, ResultMatrix> entry : resultMap.entrySet()) {
            for (int i = 0; i < (Math.min(entry.getValue().leftCount, entry.getValue().rightCount)); i++) {
                result[++index] = entry.getKey();
            }
        }

        return Arrays.copyOf(result, ++index);
    }
}
