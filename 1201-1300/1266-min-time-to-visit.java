class Solution {
  public int minTimeToVisitAllPoints(int[][] points) {
      
      int time = 0;
      for(int i=1;i<points.length;i++) {
          int[] cur = points[i];
          int[] prev = points[i-1];
          
          // Find the difference between the 2 points
          // Get the max diff between X and Y axis
          // i.e. [1,1] -> [3,4]
          // diff in X = 2
          // diff in Y = 3
          // time = 0
          // We will move diagonally to close the distance
          // diff in X = 1
          // diff in Y = 2
          // time = 1
          // Move diagonally again
          // diff in X = 0
          // diff in Y = 1
          // time = 2
          // Move veritcally because X is already 0
          // diff in X = 0
          // diff in Y = 0
          // time = 3
          // From here, we can see that time = max between diff in X and diff in Y
          time += Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
      }
      
      return time;
  }
}