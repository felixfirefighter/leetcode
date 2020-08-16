// O(n log n)
// 3 ms, faster than 69.85%
// 39.6 MB, less than 60.93%
class Solution {
  public int eraseOverlapIntervals(int[][] intervals) {
    if(intervals.length == 0) return 0;
    
    Arrays.sort(intervals, new intervalComparator());
    int end = intervals[0][1];
    
    // keep track of the interval that we can keep
    int count = 1;
    
    for(var i=1;i<intervals.length;i++) {
      // if start is larger than end, it is not overlapped,
      // increase count
      if(intervals[i][0] >= end) {
        end = intervals[i][1];
        count++;
      }
    }
    
    return intervals.length - count;
    
  }

  class intervalComparator implements Comparator<int[]> {
    public int compare(int[] a,  int[] b) {
      return a[1] - b[1];
    }
  }
}