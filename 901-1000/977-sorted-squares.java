// O(n log n)
// 2ms, 41.1MB
class Solution {
  public int[] sortedSquares(int[] A) {
      for(int i=0;i<A.length;i++) {
          A[i] *= A[i];
      }
      Arrays.sort(A);
      return A;
  }
}

// Method 2 - two pointers
// O(n), 1ms, 40.9MB
class Solution {
  public int[] sortedSquares(int[] A) {
      int lo = 0, hi = A.length -1;
      int[] result = new int[A.length];
      
      // remember that the array is sorted non-decreasing order
      for(int i=hi;i>=0;i--) {
          // i.e -12 > 10
          if(Math.abs(A[lo]) > Math.abs(A[hi])) {
              result[i] = A[lo] * A[lo];
              lo++;
          } else {
              result[i] = A[hi] * A[hi];
              hi--;
          }
      }
      
      return result;
  }
}