class Solution {
  public int findNumbers(int[] nums) {
      int count = 0;
      for(int i=0;i<nums.length;i++) {
          int numOfDigit = 0;
          while(nums[i] > 0) {
              nums[i] /= 10;
              numOfDigit++;
          }
          
          count = numOfDigit % 2 == 0 ? count + 1 : count;
      }
      return count;
  }
}