// https://leetcode.com/problems/lucky-numbers-in-a-matrix/discuss/539731/JavaPython-3-Two-23-pass-codes-w-brief-explanation-and-analysis.
class Solution {
  public List<Integer> luckyNumbers (int[][] matrix) {
      int m = matrix.length, n = matrix[0].length;
      
      // min element in row, max element in column
      int[] mi = new int[m], mx = new int[n];
      
      Arrays.fill(mi, Integer.MAX_VALUE);
      
      for(int i=0;i<m;i++) {
          for(int j=0;j<n;j++) {
              mi[i] = Math.min(matrix[i][j], mi[i]);
              mx[j] = Math.max(matrix[i][j], mx[j]);
          }
      }
      
      List<Integer> result = new ArrayList();
      for(int i=0;i<m;i++) {
          for(int j=0;j<n;j++) {
              if(mi[i] == mx[j]) {
                  result.add(mi[i]);
              }
          }
      }
      
      return result;
  }
}