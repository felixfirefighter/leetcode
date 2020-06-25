
// Method 1 - 2 nested loops
// O(mn), m = row length, n = column length
class Solution {
  public int[][] flipAndInvertImage(int[][] A) {
      int rl = A.length;
      int cl = A[0].length;
      
      // reverse the image
      for(int i=0;i<rl;i++) {
          for(int j=0;j<cl/2;j++) {
              int temp = A[i][j];
              A[i][j] = A[i][cl-1-j];
              A[i][cl-1-j] = temp;
          }
      }
      
      // invert the image
      for(int i=0;i<rl;i++) {
          for(int j=0;j<cl;j++) {
              if(A[i][j] == 0) A[i][j] = 1;
              else A[i][j] = 0;
          }
      }
      
      return A;
  }
}

// Method 2 - Use 2 pointers
// https://leetcode.com/problems/flipping-an-image/discuss/148272/Easy-Understand-One-pass-Java-Solution-absolutely-beat-100
class Solution {
  public int[][] flipAndInvertImage(int[][] A) {
      int rl = A.length;
      // use two pointers
      for(int i=0;i<rl;i++) {
          int lo = 0, hi = rl - 1;
          while(lo <= hi) {
              // flip 0 -> 1, 1 -> 0 if low == high
              if(A[i][lo] == A[i][hi]) {
                  // 1 - 0 = 1, 1 - 1 = 0, achieve flipping effect
                  A[i][lo] = 1 - A[i][lo];
                  A[i][hi] = A[i][lo];
              }
              lo++;
              hi--;
          }
      }
      
      return A;
  }
}