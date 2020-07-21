// O(n)
// 2ms, 57.81%
// 38.7MB, 92.38%
class Solution {
  public boolean checkIfExist(int[] arr) {
      var set = new HashSet<Integer>();
      for(var i=0;i<arr.length;i++) {
          // only even number has integer whole number after division
          if(arr[i] % 2 == 0 && set.contains(arr[i] / 2) || set.contains(arr[i] * 2)) {
              return true;
          } 
          set.add(arr[i]);
      }
      
      return false;
  }
}