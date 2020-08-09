// O(log(n))
// 1 ms, faster than 100.00%
// 36.7 MB, less than 72.34%
class Solution {
  public int mySqrt(int x) {
    int left = 1, right = x;
    if(x < 2) {
      return x;
    }
    
    while(left <= right) {
      int mid = left + (right - left) / 2;
      if(mid == x / mid) {
        return mid;
      } else if(mid > x / mid) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    
    return right;
  }
}