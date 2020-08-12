// O(n^2)
// 1 ms, faster than 86.53%
// 37.1 MB, less than 63.15% 
class Solution {
  public List<Integer> getRow(int rowIndex) {
    var res = new ArrayList<Integer>();
    res.add(1);
    
    for(var i=1;i<=rowIndex;i++) {
      var prev = new ArrayList<Integer>(res);
      
      // add first element, always 1
      res = new ArrayList<Integer>();
      res.add(1);
      for(var j=1;j<i;j++) {
        res.add(prev.get(j-1) + prev.get(j));
      }
      
      // add last element, always 1
      res.add(1);
    }
    
    return res;
  }
}

// https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
  public List<Integer> getRow(int rowIndex) {
    var res = new ArrayList<Integer>();
    res.add(1);
    
    for(var i=1;i<=rowIndex;i++) {
      for(var j=i-1;j>=1;j--) {
        var temp = res.get(j-1) + res.get(j);
        res.set(j, temp);
      }
      res.add(1);
    }
    
    return res;
  }
}