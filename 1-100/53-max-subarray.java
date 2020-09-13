class Solution {
  public int maxSubArray(int[] nums) {
    
    var n = nums.length;
    var dp = new int[n];
    dp[0] = nums[0];
    var max = dp[0];
    
    for(var i=1;i<nums.length;i++) {
      dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
      max = Math.max(max, dp[i]);
    }
    
    return max;
  }
}