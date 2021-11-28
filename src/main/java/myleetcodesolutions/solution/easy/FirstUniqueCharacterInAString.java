package myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString implements Serializable {
    public int firstUniqChar(String s) {
        int index = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}
