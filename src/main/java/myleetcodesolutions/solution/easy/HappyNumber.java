package myleetcodesolutions.solution.easy;

import java.io.Serializable;

/**
 * URL: https://leetcode.com/problems/happy-number/
 */
public class HappyNumber implements Serializable {
    public boolean isHappy(int n) {
        while (n > 6) {
            int sum = 0;
            while (n > 0) {
                sum += ((n % 10) * (n % 10));
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
