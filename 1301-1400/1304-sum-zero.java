// O(n)
// 0ms, 37MB
class Solution {
  public int[] sumZero(int n) {
      int[] result = new int[n];
      int mid = n/2;
      int startNum = -1;
      for(int i=0;i<mid;i++) {
          int end = n - 1 - i;
          result[end] = Math.abs(startNum);
          result[i] = startNum;
          startNum--;
      }
      
      return result;
  }
}