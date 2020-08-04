// https://leetcode.com/problems/power-of-four/discuss/772289/2-Solution-or-Math-and-1-Liner-Explained
// O(n)
// 1 ms, faster than 100.00%
// 37 MB, less than 10.62%
class Solution {
    public boolean isPowerOfFour(int num) {
        while(num > 1) {
            if(num % 4 != 0) return false;
            num /= 4;
        }
        
        return num == 1;
    }
}