/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move towards the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1, rest are already 0 by default
        return newDigits;
    }
}
// @lc code=end

