/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        String[] map = {
            "0", "1", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(res, map, digits, 0, new StringBuilder());

        return res;
    }

    private void backtrack(
        List<String> res, String[] map,
        String digits, int index,
        StringBuilder current) {

        // Base Case
        if (index == digits.length()) {
            res.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(res, map, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
// @lc code=end

