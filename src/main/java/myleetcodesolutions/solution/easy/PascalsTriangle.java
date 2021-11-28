package myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * URL: https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle implements Serializable {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        list.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}
