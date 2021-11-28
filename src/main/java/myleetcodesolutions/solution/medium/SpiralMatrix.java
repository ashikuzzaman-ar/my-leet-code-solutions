package myleetcodesolutions.solution.medium;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * URL: https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralMatrix implements Serializable {
    public List<Integer> spiralOrder(int[][] ints) {
        if (ints == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>(ints.length * ints[0].length);
        List<List<Integer>> matrix = new ArrayList<>(ints.length);
        //Initializing matrix in list
        for (int[] row : ints) {
            List<Integer> rowList = new ArrayList<>(row.length);
            for (int column : row) {
                rowList.add(column);
            }
            matrix.add(rowList);
        }
        int i = -1;
        while (!matrix.isEmpty()) {
            switch (++i % 4) {
                //Traversing top left to top right
                case 0: {
                    result.addAll(matrix.get(0));
                    matrix.remove(0);
                    break;
                }
                //Traversing right top to right down
                case 1: {
                    for (List<Integer> list : matrix) {
                        result.add(list.remove(list.size() - 1));
                    }
                    matrix.removeIf(List::isEmpty);
                    break;
                }
                //Traversing down right to down left
                case 2: {
                    List<Integer> list = matrix.get(matrix.size() - 1);
                    while (!list.isEmpty()) {
                        result.add(list.remove(list.size() - 1));
                    }
                    matrix.remove(list);
                    break;
                }
                //Traversing left down to left top
                case 3: {
                    for (int j = matrix.size() - 1; j >= 0; j--) {
                        result.add(matrix.get(j).remove(0));
                    }
                    matrix.removeIf(List::isEmpty);
                }
            }
        }
        return result;
    }
}
