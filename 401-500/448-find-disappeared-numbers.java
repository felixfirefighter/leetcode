// With extra space
// 7 ms, faster than 54.37%
// 63 MB, less than 5.01%
class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
      var count = new boolean[nums.length + 1];
      for(var num : nums) {
          count[num] = true;
      }
      
      var res = new ArrayList<Integer>();
      for(int i=1;i<count.length;i++) {
          if(!count[i]) res.add(i);
      }
      
      return res;
  }
}

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/discuss/92956/Java-accepted-simple-solution
class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> ret = new ArrayList<Integer>();
      
      for(int i = 0; i < nums.length; i++) {
          int val = Math.abs(nums[i]) - 1;
          if(nums[val] > 0) {
              nums[val] = -nums[val];
          }
      }
      
      for(int i = 0; i < nums.length; i++) {
          if(nums[i] > 0) {
              ret.add(i+1);
          }
      }
      return ret;
  }
}