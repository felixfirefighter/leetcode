// https://leetcode.com/problems/h-index/discuss/70768/Java-bucket-sort-O(n)-solution-with-detail-explanation
// O(n)
// 0 ms, faster than 100.00%
// 37.1 MB, less than 91.64%
class Solution {
  public int hIndex(int[] citations) {
    var length = citations.length;
    var buckets = new int[length+1];
    for(var c : citations) {
      if(c > length) {
        buckets[length]++;
      } else {
        buckets[c]++;
      }
    }
    
    var count = 0;
    for(var i=length;i>=0;i--) {
      count += buckets[i];
      if(count >= i) {
        return i;
      }
    }
    
    return 0;
  }
}