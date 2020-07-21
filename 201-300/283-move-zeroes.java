class Solution {
  public void moveZeroes(int[] nums) {
      var length = 0;
      for(int i=0;i<nums.length;i++) {
          if(nums[i] != 0) {
              nums[length++] = nums[i];
          }
      }
      
      for(int i=length;i<nums.length;i++) {
          nums[i] = 0;
      }
  }
}