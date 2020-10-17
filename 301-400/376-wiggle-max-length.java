/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Wiggle Subsequence.
Memory Usage: 36.5 MB, less than 15.93% of Java online submissions for Wiggle Subsequence.
*/
class Solution {
  public int wiggleMaxLength(int[] nums) {
    if(nums.length < 2) return nums.length;
    
    var len = 1;
    var state = 1; // 1 = begin, 2 = up, 3 = down
    
    for(var i=1;i<nums.length;i++) {
      if(state == 1) {
        if(nums[i] < nums[i-1]) {
          len++;
          state = 3;
        } else if(nums[i] > nums[i-1]) {
          len++;
          state = 2;
        }
      }
      else if(state == 2 && nums[i] < nums[i-1]) {
        len++;
        state = 3;
      } else if(state == 3 && nums[i] > nums[i-1]) {
        len++;
        state = 2;
      }
    }
    
    return len;
  }
}