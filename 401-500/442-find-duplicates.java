// 50 ms, faster than 5.14%
// 79.4 MB, less than 5.03%
class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    var set = new HashSet<Integer>();
    var res = new HashSet<Integer>();
        
    for(var num : nums) {
        if(!set.add(num)) res.add(num);
    }
        
    return new ArrayList<Integer>(res);
  }
}

// https://leetcode.com/problems/find-all-duplicates-in-an-array/discuss/92387/Java-Simple-Solution
class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    var res = new ArrayList<Integer>();
      
    for(var i=0;i<nums.length;i++) {
      int index = Math.abs(nums[i]) - 1;
      if(nums[index] < 0) {
        res.add(index + 1);
      }
      nums[index] = -nums[index];
    }
      
    return res;
  }
}

