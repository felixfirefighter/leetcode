// O(l), l = length of string
// 1 ms, faster than 100.00%
// 38.1 MB, less than 80.57%
class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int multiplier = 1;
        for(int i=s.length() - 1;i>=0;i--) {
            char c = s.charAt(i);
            
            res += (int)(c - 'A' + 1) * multiplier;
            multiplier *= 26;
        }
        
        return res;
    }
}