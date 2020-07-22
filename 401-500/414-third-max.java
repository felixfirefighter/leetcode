// https://leetcode.com/problems/third-maximum-number/discuss/460676/O(N)-JAVA-SOLUTION-%2B-TREESET
// 26 ms, faster than 6.26%
// 42.4 MB, less than 5.00% 
class Solution {
  public int thirdMax(int[] nums) {
      var ts = new TreeSet<Integer>();
      for(int num : nums) {
          ts.add(num);
          
          // remove the smallest num if the size is larger than
          // 3
          if(ts.size() > 3) {
              ts.pollFirst();
          }
      }
      
      // return the max if third max does not exist
      return ts.size() == 3 ? ts.first() : ts.last();
  }
}