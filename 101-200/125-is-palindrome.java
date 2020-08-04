// O(n)
// 23 ms, faster than 25.69%
// 40.7 MB, less than 9.23%
class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^A-Za-z0-9]", "");
        int i = 0, j = s.length() - 1;
        
        while(i < j) {
            if(Character.toLowerCase(s.charAt(i)) 
               != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            
            i++;
            j--;
        }
        
        
        return true;
    }
}