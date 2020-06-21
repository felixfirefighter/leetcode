class Solution {
  public int maxProduct(int[] nums) {
      Arrays.sort(nums);
      
      return (nums[nums.length-2] - 1) * (nums[nums.length-1] - 1);
  }
}

class Solution {
  public int maxProduct(int[] nums) {
      int first = -1, second = -1;
      
      for(int i=0;i<nums.length;i++) {
          // if the current num is larger than the first largest number
          // store current first largest number to the second largest number
          if(nums[i] > first) {
              second = first;
              first = nums[i];
          } else if(nums[i] > second) {
              second = nums[i];
          }
      }
      
      return (first - 1) * (second - 1);
  }
}