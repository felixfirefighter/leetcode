// Method 1 - HashMap
// O(n), 18ms, 39.5MB
class Solution {
  public int repeatedNTimes(int[] A) {
      HashMap<Integer, Integer> map = new HashMap();
      
      int n = A.length/2;
      
      for(int i=0;i<A.length;i++) {
          int count = map.getOrDefault(A[i], 0) + 1;
          if(count == n) {
              return A[i];
          }
          map.put(A[i], count);
      }
              
      return 0;
  }
}