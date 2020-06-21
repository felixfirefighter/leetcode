
// Method 1 : Naive solution
class Solution {
    
  /* The problem requires us to increment all the cells on the row and column
     where the index is.
     Let's assume we have a 2 x 2 matrix, initialized by zeroes
     [
      [0, 0],
      [0, 0]
     ]
     The given index is [1,1] = cell at 2nd row, 2nd column
     marked with *
     [
      [0, 0],
      [0, 0*]
     ]
  
     We first increment all the cells on the row by 1
     [
      [0, 0],
      [1, 1]
     ]
     We then increment all the cells on the column by 1
    [
      [0, 1],
      [1, 2]
     ]
     
     Rinse and repeat for all the indices
     
     We then find the odd cells
  */
  public int oddCells(int n, int m, int[][] indices) {
      int[][] matrix = new int[n][m];
      
      int oddCount = 0;
      
      for(int i=0;i<indices.length;i++) {
          int[] index = indices[i];
          int row = index[0];
          int column = index[1];
          
          // increment all cells in that row
          for(int c=0;c<m;c++) {
              matrix[row][c] += 1;
          }
          
          // increment all cells in that column
          for(int r=0;r<n;r++) {
              matrix[r][column] += 1;
          }
      }
      
      for(int i=0;i<n;i++) {
          for(int j=0;j<m;j++) {
              if(matrix[i][j] % 2 == 1) oddCount++;
          }
      }
      
      return oddCount;
  }
}


// More solutions with analysis
// Method 2 - O(n * m + L)
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/discuss/425100/JavaPython-3-2-methods%3A-time-O(m-*-n-%2B-L)-and-O(L)-codes-w-comment-and-analysis.
class Solution {
  public int oddCells(int n, int m, int[][] indices) {
      boolean[] oddRows = new boolean[n];
      boolean[] oddCols = new boolean[m];
      
      for(int[] index : indices) {
          // exclusive or, it will only be true if it appears odd time
          // true ^ true = false
          // false ^ true = true
          // false ^ false = false
          oddRows[index[0]] ^= true;
          oddCols[index[1]] ^= true;
      }
      
      int count = 0;
      for(int i=0;i<n;i++) {
          for(int j=0;j<m;j++) {
              // if both of row and col show up as odd, it cannot be odd as
              // final result because odd + odd = even number
              count += oddRows[i] ^ oddCols[j] ? 1 : 0; 
          }
      }
      
      return count;
  }
}

// Method 3 - O(n + m + L)
class Solution {
  public int oddCells(int n, int m, int[][] indices) {
      boolean[] oddRows = new boolean[n];
      boolean[] oddCols = new boolean[m];
      
      for(int[] index : indices) {
          // exclusive or, it will only be true if it appears odd time
          // true ^ true = false
          // false ^ true = true
          // false ^ false = false
          oddRows[index[0]] ^= true;
          oddCols[index[1]] ^= true;
      }
      
      int oddRowCount = 0;
      int oddColCount = 0;
      for(boolean isOdd : oddRows) {
          oddRowCount += isOdd ? 1 : 0;
      }
      
      for(boolean isOdd : oddCols) {
          oddColCount += isOdd ? 1 : 0;
      }
      
      int evenRows = n - oddRowCount;
      int evenCols = m - oddColCount;
  
      // odd + odd = even, so we only get product of odd * even
      return evenRows * oddColCount + evenCols * oddRowCount;
  }
}

// Method 4 - Use BitSet
// O(L)
class Solution {
  public int oddCells(int n, int m, int[][] indices) {
      BitSet oddRows = new BitSet(n);
      BitSet oddCols = new BitSet(m);
      
      // flip the bit
      for(int[] index : indices) {
          oddRows.flip(index[0]);
          oddCols.flip(index[1]);
      }
      
      // get the count of the bit that is true using cardinality
      int oddRowCount = oddRows.cardinality();
      int oddColCount = oddCols.cardinality();
      
      int evenRow = n - oddRowCount;
      int evenCol = m - oddColCount;
      return oddRowCount * evenCol + oddColCount * evenRow;
  }
}





