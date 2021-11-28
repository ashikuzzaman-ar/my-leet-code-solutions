package myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.Map;

/**
 * URL: https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger implements Serializable {

    private static final Map<Character, Integer> CHARACTER_MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && CHARACTER_MAP.get(s.charAt(i)) < CHARACTER_MAP.get(s.charAt(i + 1))) {
                result += (CHARACTER_MAP.get(s.charAt(i + 1)) - CHARACTER_MAP.get(s.charAt(i)));
                i++;
            } else {
                result += CHARACTER_MAP.get(s.charAt(i));
            }
        }
        return result;
    }
}
