/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
Memory Usage: 36.6 MB, less than 13.13% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
*/
class Solution {
  public int minCostToMoveChips(int[] position) {
    var odd = 0;
    var even = 0;
    for(var pos : position) {
      if(pos % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    
    return Math.min(even, odd);
  }
}