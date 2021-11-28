package myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes implements Serializable {
    public void moveZeroes(int[] numbs) {
        if (numbs == null || numbs.length < 2) {
            return;
        }
        int realIndex = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] != 0) {
                numbs[realIndex++] = numbs[i];
            }
        }
        if (realIndex == 0) {
            return;
        }
        while (realIndex < numbs.length) {
            numbs[realIndex++] = 0;
        }
    }
}
