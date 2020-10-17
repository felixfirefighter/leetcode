/*
Runtime: 6 ms, faster than 99.60% of Java online submissions for Assign Cookies.
Memory Usage: 39.7 MB, less than 22.19% of Java online submissions for Assign Cookies.
*/
class Solution {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    
    var gPtr = 0;
    var sPtr = 0;
    
    while(gPtr < g.length && sPtr < s.length) {
      // child is content
      if(g[gPtr] <= s[sPtr]) {
        gPtr++;
      }
      
      sPtr++;
    }
    
    return gPtr;
  }
}