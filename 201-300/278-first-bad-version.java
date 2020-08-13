// O(log N)
// 12 ms, faster than 99.31%
// 36.5 MB, less than 41.47%
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
          int lo = 0, hi = n - 1;
          while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if(isBadVersion(mid)) hi = mid - 1;
            else lo = mid + 1;
          }
          
          // during the last iteration(lo == hi), if mid is a good version,
          // we have to return the first bad version (lo = mid + 1),
          // if mid is a bad version, lo is already a bad version, return it
          return lo;
        }
    }