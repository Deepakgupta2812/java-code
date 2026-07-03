/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1; // Ways to climb to the first step
        int second = 2; // Ways to climb to the second step
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second; // Current step can be reached from the previous two steps
            first = second; // Move the window forward
            second = current;
        }

        return current; 
    }
}
// @lc code=end

