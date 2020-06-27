// O(n), 1ms, 37.2MB
class Solution {
  public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer, Integer> map = new HashMap();
      
      for(int num : arr) {
          map.put(num, map.getOrDefault(num, 0) + 1);
      }
      
      HashSet<Integer> set = new HashSet();
      for(Integer count : map.values()) {
          if(!set.add(count)) {
              return false;
          }
      }
      
      return true;
  }
}