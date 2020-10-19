class Solution {
  public List<String> buildArray(int[] target, int n) {
    var res = new ArrayList<String>();
    
    var index = 0;
    var current = 1;
    while(index < target.length && current <= n) {
      res.add("Push");
      if(target[index] == current) {
        index++;
      } else {
        res.add("Pop");
      }
      
      current++;
    }
    
    return res;
  }
}