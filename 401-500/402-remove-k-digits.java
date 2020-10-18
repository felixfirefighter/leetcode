class Solution {
  public String removeKdigits(String num, int k) {
    var s = new ArrayList<Integer>();
    var sb = new StringBuilder();
    
    for(var i=0;i<num.length();i++) {
      int number = num.charAt(i) - '0';
      while(s.size() != 0 && s.get(s.size() - 1) > number && k > 0) {
        k--;
        s.remove(s.size() - 1);
      }
      
      if(s.size() != 0 || number != 0) {
        s.add(number);
      }
    }
    
    // we still can remove digit
    while(s.size() != 0 && k > 0) {
      k--;
      s.remove(s.size() - 1);
    }
    
    for(var i=0;i<s.size();i++) {
      sb.append(s.get(i));
    }
    
    if(sb.length() == 0) return "0";
    
    return sb.toString();
  }
}