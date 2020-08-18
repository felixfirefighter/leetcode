// O(n)
// 1 ms, faster than 91.90%
// 36.9 MB, less than 89.21%
class Solution {
  public int[] distributeCandies(int candies, int num_people) {
    var res = new int[num_people];
    for(var i=0; candies > 0;candies -= i) {
      res[i % num_people] += Math.min(candies, ++i);
    }
    
    return res;
  }
}