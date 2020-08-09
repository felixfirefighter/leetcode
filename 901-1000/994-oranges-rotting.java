// 3 ms, faster than 82.96%
// 39.1 MB, less than 76.47%
class Solution {
  public int orangesRotting(int[][] grid) {
    if(grid == null || grid.length == 0) return 0;
    int rows = grid.length;
    int cols = grid[0].length;
    
    Queue<int[]> q = new LinkedList<int[]>();
    int freshCount = 0;
    // put rotten orange in queue
    // count fresh orange
    for(int i=0;i<rows;i++) {
      for(int j=0;j<cols;j++) {
        if(grid[i][j] == 2) q.offer(new int[] { i, j });
        else if(grid[i][j] == 1) freshCount++;
      }
    }
    
    int count = 0;
    if(freshCount == 0) return count;
    
    // 4-directionally - top, bottom, left, right
    int[][] directions = {{ 0,1 }, { 0,-1 }, { -1,0 }, { 1,0 }};
    
    // start from initial rotten orange
    while(!q.isEmpty()) {
      if(freshCount == 0) return count;
      count++;
      int size = q.size();
      
      // go through all the rotten oranges
      for(var i=0;i<size;i++) {
        // get the position of rotten orange
        int[] pos = q.poll();
        for(var direction : directions) {
          int x = pos[0] + direction[0];
          int y = pos[1] + direction[1];
          
          // if x or y out of bound
          // or orange is already rotten / no orange
          // do nothing
          if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2) continue;
          
          grid[x][y] = 2;
          q.offer(new int[] { x,y });
          freshCount--;
        }
      }
    }
    
    return -1;
  }
}