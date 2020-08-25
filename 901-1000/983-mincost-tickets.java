class Solution {
  public int mincostTickets(int[] days, int[] costs) {
    // track travel day
    var isTravelDay = new boolean[366];
    for(var day : days) {
      isTravelDay[day] = true;
    }
    
    var minCost = new int[366];
    int min = 0;
    
    for(var day=1;day<366;day++) {
      if(isTravelDay[day]) {
        // 1-day pass
        min = minCost[day - 1] + costs[0];
        
        // 7-day pass, get the lower price by comparing to 1-day pass
        min = Math.min(min, minCost[Math.max(0, day - 7)] + costs[1]);
        
        // 30-day pass, get the min
        min = Math.min(min, minCost[Math.max(0, day - 30)] + costs[2]);
        
        minCost[day] = min;
      } else {
        minCost[day] = minCost[day-1];
      }
    }
    
    return minCost[365];
  }
}