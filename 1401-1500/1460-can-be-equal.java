
// Method 1 - Use HashMap
// 7ms, 40MB
class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
      
      // Constraints: target length == arr.length
      int length = target.length;
      
      // check both arr have the same number of the same elements
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      
      for(int i=0;i<length;i++) {
          int targetValue = target[i];
          int arrValue = arr[i];
          
          map.put(targetValue, map.getOrDefault(targetValue, 0) + 1);
          map.put(arrValue, map.getOrDefault(arrValue, 0) - 1);
      }
      
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if(entry.getValue() != 0) {
              return false;
          }
      }
      
      return true;
  }
}

// Method 2 - Use count
// 1ms, 39.6MB
class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
      // Constraints: 1 ~ 1000 for target[i] and arr[i]
      int[] count = new int[1001];
      for(int i=0;i<target.length;i++) {
          count[target[i]]++;
          count[arr[i]]--;
      }
      
      
      for(int i=0;i<arr.length;i++) {
          if(count[arr[i]] != 0) return false;
      }
      
      return true;
  }
}