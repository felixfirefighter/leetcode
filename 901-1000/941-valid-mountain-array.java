class Solution {
  public boolean validMountainArray(int[] A) {
      if(A.length < 3 || A[0] > A[1]) return false;
      
      var peak = false;
      for(int i=1;i<A.length;i++) {
          if(peak && A[i] > A[i-1] || A[i] == A[i-1]) return false;
          peak = A[i] < A[i-1];
      }
      
      return peak;
  }
}