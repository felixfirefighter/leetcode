// https://leetcode.com/problems/detect-capital/discuss/766310/4-Solutions-or-Counting-or-Regex-Explained-or-Using-String-Methods-or-1-Liner
// 2 ms, faster than 51.16%
// 38.5 MB, less than 11.43%
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || 
            word.substring(1).toLowerCase().equals(word.substring(1));
    }
}