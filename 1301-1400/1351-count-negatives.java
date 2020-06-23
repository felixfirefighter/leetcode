
// Method 1 - 2 loops
// O(n^2)
class Solution {
  public int countNegatives(int[][] grid) {
      int count = 0;
      for(int i=grid.length-1;i>=0;i--) {
          for(int j=grid[0].length-1;j>=0;j--) {
              if(grid[i][j] < 0) {
                  count++;
              } else {
                  break;
              }
          }
      }
      
      return count;
  }
}

// Method 2 - Walk the staircase
// O(n)
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/discuss/510249/JavaPython-3-2-similar-O(m-%2B-n)-codes-w-brief-explanation-and-analysis.
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0, n = grid[0].length, c = 0, r = grid.length - 1;
        while(r >=0 && c < n) {
            if(grid[r][c] < 0) {
                // move r index "up" in the matrix
                r--;
                count += n - c;
            } else {
                c++;
            }
        }
        
        return count;
    }
}