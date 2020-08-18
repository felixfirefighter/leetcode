// O(nk)
// 
class Solution {
  public int maxProfit(int[] prices) {
    if(prices.length == 0) return 0;
    
    // 2 transactions + 1 length
    var profits = new int[3][prices.length];
    for(var t=1;t<3;t++) {
      int maxThusFar = Integer.MIN_VALUE;
      for(var d=1;d<prices.length;d++) {
        maxThusFar = Math.max(maxThusFar, profits[t - 1][d - 1] - prices[d -1]);
        profits[t][d] = Math.max(profits[t][d - 1], maxThusFar + prices[d]);
      }
    }
    
    return profits[3-1][prices.length-1];
  }
}