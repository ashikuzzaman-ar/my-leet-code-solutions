package myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome implements Serializable {
    public boolean isPalindrome(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            boolean isC1Letter = Character.isLetterOrDigit(c1);
            if (!isC1Letter) {
                i++;
                continue;
            }
            boolean isC2Letter = Character.isLetterOrDigit(c2);
            if (!isC2Letter) {
                j--;
                continue;
            }
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
