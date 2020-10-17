/*
Runtime: 19 ms, faster than 55.83% of Java online submissions for Repeated DNA Sequences.
Memory Usage: 47.4 MB, less than 5.76% of Java online submissions for Repeated DNA Sequences.
*/
class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
    var map = new HashMap<String, Integer>();
    
    
    for(var i=0;i<s.length() - 9;i++) {
      var substr = s.substring(i, i + 10);
      map.put(substr, map.getOrDefault(substr, 0) + 1);
    }
    
    var res = new ArrayList<String>();
    
    for(var entry : map.entrySet()) {
      if(entry.getValue() > 1) {
        res.add(entry.getKey());
      }
    }
    
    return res;
  }
}