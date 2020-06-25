// Method 1 - Return new array
// O(n), 1ms, 40MB
class Solution {
  public int[] sortArrayByParity(int[] A) {
      int length = A.length;
      int[] result = new int[length];
      int lo = 0, hi = length - 1;
      
      for(int i=0;i<length;i++) {
          if(A[i] % 2 == 0) {
              result[lo] = A[i];
              lo++;
          } else {
              result[hi] = A[i];
              hi--;
          }
      }
      
      return result;
  }
}

// Method 2 - In place swap
// O(n), 1ms, 45.8MB
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int lo = 0, hi = length - 1;
        
        while(lo < hi) {
            if(A[lo] % 2 == 0) {
                // it is even
                lo++;
            } else {
                // A[lo] is odd
                // A[hi] is odd as well, do not swap
                if(A[hi] % 2 == 1) {
                    hi--;
                } else if(A[hi] % 2 == 0) {
                    swap(A, lo, hi);
                    lo++;
                    hi--;
                }
            }
        }
        
        return A;
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}