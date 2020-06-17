class Solution {
  public int[] shuffle(int[] nums, int n) {
      int[] result = new int[nums.length];
      int firstPointer = 0;
      int secondPointer = n;
      int i = 0;
      while(i < result.length) {
          result[i] = nums[firstPointer];
          result[i+1] = nums[secondPointer];
          i+=2;
          firstPointer++;
          secondPointer++;
      }
      return result;
  }
}