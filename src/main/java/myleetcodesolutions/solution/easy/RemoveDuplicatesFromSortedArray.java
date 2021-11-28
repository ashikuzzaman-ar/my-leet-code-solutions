package myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray implements Serializable {
    public int removeDuplicates(int[] numbs) {
        if (numbs == null || numbs.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 1; i < numbs.length; i++) {
            if (numbs[k] != numbs[i]) {
                numbs[++k] = numbs[i];
            }
        }
        return k + 1;
    }
}
