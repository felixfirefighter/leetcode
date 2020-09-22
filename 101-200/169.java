class Solution {
  public int majorityElement(int[] nums) {
    int majority = nums.length / 2;
    var map = new HashMap<Integer, Integer>();
    for(var num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    for(var entry : map.entrySet()) {
      if(entry.getValue() > majority) return entry.getKey();
    }
    
    return 0;
  }
}

// A Linear Time Majority Vote Algorithm
// http://www.cs.utexas.edu/~moore/best-ideas/mjrty/
class Solution {
  public int majorityElement(int[] nums) {
    int major=nums[0], count = 1;
    for(var i=1;i<nums.length;i++) {
      if(count == 0) {
        count++;
        major = nums[i];
      } else if(major == nums[i]) {
        count++;
      } else {
        count--;
      }
    }
    
    return major;
  }
}