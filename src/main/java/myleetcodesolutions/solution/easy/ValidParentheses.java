package myleetcodesolutions.solution.easy;

import java.io.Serializable;
import java.util.Stack;

/**
 * URL: https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses implements Serializable {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': {
                    stack.push(')');
                    break;
                }
                case '{': {
                    stack.push('}');
                    break;
                }
                case '[': {
                    stack.push(']');
                    break;
                }
                default: {
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
