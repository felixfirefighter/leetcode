/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Consecutive Characters.
Memory Usage: 37.4 MB, less than 20.10% of Java online submissions for Consecutive Characters
*/
class Solution {
  public int maxPower(String s) {
    var max = 1;
    var cur = 1;
    
    for(var i=1;i<s.length();i++) {
      if(s.charAt(i) == s.charAt(i-1)) {
        cur++;
      } else {
        cur = 1;
      }
      
      if(max < cur) {
        max = cur;
      }
    }
    
    return max;
  }
}