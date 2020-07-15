class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      var res = 0;
      var cur = 0;
      for(var num : nums) {
          if(num == 1) {
              cur++;
          } else {
              // check cur is larger
              res = cur > res && cur != 0 ? cur : res;
              cur = 0;
          }
      }
      
      res = cur > res && cur != 0 ? cur : res;
      
      return res;
  }
}

// More elegant solution
class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      var res = 0;
      var count = 0;
      for(var num : nums) {
          if(num == 0) {
              count = 0;
          } else {
              count++;
              res = Math.max(count, res);
          }
      }
      
      return res;
  }
}