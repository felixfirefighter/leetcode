// O(mn) - m = string length, n = array length
class Solution {
  public int minDeletionSize(String[] A) {
      int result = 0;
      
      // Get the string length, they all have the same length
      int n = A[0].length();
      
      for(int i=0;i<n;i++) {
          for(int j=1;j<A.length;j++) {
              if(A[j-1].charAt(i) > A[j].charAt(i)) {
                  result++;
                  break;
              }                
          }
      }
      
      return result;
  }
}