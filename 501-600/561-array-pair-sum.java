// Method 1 - Sort then add
// O(n log n), 11ms, 41.4MB
class Solution {
  public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);
      
      int result = 0;
      
      for(int i=0;i<nums.length;i+=2) {
          // result += Math.min(nums[i], nums[i+1]);
          result += nums[i];
      }
      
      return result;
  }
}

