// Method 1 - Sort and compare
// O(n log n), 3ms, 39.1MB
class Solution {
  public List<Integer> minSubsequence(int[] nums) {
      List<Integer> result = new ArrayList();
      
      Arrays.sort(nums);
      
      // sum of the entire array
      int sum = 0;
      
      // sum of included elements  
      int includedSum = 0;
      
      for(int i=nums.length-1;i>=0;i--) {
          sum += nums[i];
      }
      
      for(int i=nums.length-1;i>=0;i--) {
          includedSum += nums[i];
          result.add(nums[i]);
          
          if(includedSum > sum - includedSum) {
              break;
          }
      }
      
      return result;
  }
}

// Method 2 - Priority Queue
// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/discuss/564289/C%2B%2BJava-Priority-Queue
// O(n log n), 5ms, 40MB
class Solution {
  public List<Integer> minSubsequence(int[] nums) {
      List<Integer> result = new ArrayList();
      var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
      int subSum = 0, totalSum = 0;
      for(var num : nums) {
          pq.offer(num);
          totalSum += num;
      }
      
      while(subSum <= totalSum /2) {
          int el = pq.poll();
          result.add(el);
          subSum += el;
      }
      
      return result;
  }
}