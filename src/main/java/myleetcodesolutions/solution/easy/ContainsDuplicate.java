package myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate implements Serializable {
    public boolean containsDuplicate(int[] numbs) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int numb : numbs) {
            Integer counter = map.getOrDefault(numb, 0);
            if (counter != 0) {
                return true;
            }
            map.put(numb, ++counter);
        }
        return false;
    }
}
