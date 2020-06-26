// Two pointers
// O(n), 2ms, 41MB
class Solution {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int lo = 0, hi = length;
        int[] result = new int[length+1];
        
        for(int i=0;i<length;i++) {
            char c = S.charAt(i);
            result[i] = c == 'I' ? lo++ : hi--;
        }
        
        result[length] = lo;
        
        return result;
    }
}