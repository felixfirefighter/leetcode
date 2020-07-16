// O(n)
// 1ms, 9.25%
// 39.2MB, 20.35%
class Solution {
  public int removeElement(int[] nums, int val) {
      int length = nums.length;
      int i=0;
      int j=nums.length-1;
      
      while(i <= j) {
          if(nums[i] == val) {
              // replace nums[i] with nums[j] if it is not the same
              // as value
              while(i < j && nums[j] == val) {
                  j--;
                  length--;
              }
              
              nums[i++] = nums[j--];
              length--;
          } else {
              i++;
          }
      }
      
      return length;
  }
}

// O(n)
// 0ms, 100%
// 38.4MB, 28.50%
class Solution {
  public int removeElement(int[] nums, int val) {
      int m=0;
      for(int i=0;i<nums.length;i++) {
          if(nums[i] != val) {
              nums[m] = nums[i];
              m++;
          }
      }
      return m;
  }
}