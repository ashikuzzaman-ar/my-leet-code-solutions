package myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix implements Serializable {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs != null && strs.length > 0 ? strs[0] : "";
        if (strs == null || strs.length < 2) {
            return prefix;
        }
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            if (prefix.length() > current.length()) {
                prefix = prefix.substring(0, current.length());
            }
            int j = 0;
            StringBuilder tempPrefix = new StringBuilder();
            while (j < prefix.length() && prefix.charAt(j) == current.charAt(j)) {
                tempPrefix.append(prefix.charAt(j));
                j++;
            }
            if (tempPrefix.length() == 0) {
                return "";
            } else {
                prefix = tempPrefix.toString();
            }
        }
        return prefix;
    }
}
