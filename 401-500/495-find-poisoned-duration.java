class Solution {
  public int findPoisonedDuration(int[] timeSeries, int duration) {
    if(timeSeries.length == 0) return 0;
    
    var res = 0;
    for(var i=0;i<timeSeries.length - 1;i++) {
      res += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
    }
    
    res += duration;
    return res;
  }
}