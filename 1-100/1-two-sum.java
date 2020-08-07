// O(n)
// 1 ms, faster than 99.96%
// 39.6 MB, less than 44.16%
class Solution {
  public int[] twoSum(int[] nums, int target) {
    var map = new HashMap<Integer, Integer>();
    var res = new int[2];
    for(int i=0;i<nums.length;i++) {
      var hasKey = map.containsKey(target - nums[i]);
      if(hasKey) {
        res[0] = map.get(target - nums[i]);
        res[1] = i;
        return res;
      }
      
      map.put(nums[i], i);
    }
    
    return res;
  }
}