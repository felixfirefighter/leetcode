// O(n)
// 0ms, 100%
// 41.5MB, 38.48%
class Solution {
  public int removeDuplicates(int[] nums) {
      if(nums.length < 2) return nums.length;
      int length = 1;
      for(int i=1;i<nums.length;i++) {
          if(nums[i] != nums[i-1]) {
              nums[length++] = nums[i];
          }
      }
      
      return length;
  }
}