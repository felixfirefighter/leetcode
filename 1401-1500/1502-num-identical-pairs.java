// O(n^2)
// 1 ms, faster than 81.30%
// 37 MB, less than 45.88%
class Solution {
  public int numIdenticalPairs(int[] nums) {
    var res = 0;
    for(int i=0;i<nums.length;i++) {
      for(int j=i+1;j<nums.length;j++) {
        if(nums[i] == nums[j]) res++;
      }
    }
    
    return res;
  }
}

// https://leetcode.com/problems/number-of-good-pairs/discuss/757104/3-Solution-O(n)-with-Map-O(nlogn)-Sorting-and-O(n2)-or-Detailed-Explanation
// https://leetcode.com/problems/number-of-good-pairs/discuss/731561/JavaC%2B%2BPython-Count
// O(n)
// 0 ms, faster than 100.00%
// 37 MB, less than 42.09%
class Solution {
  public int numIdenticalPairs(int[] nums) {
    var count = new int[101];
    var res = 0;
    for(var num : nums) {
      res += count[num]++;
    }
    
    return res;
  }
}