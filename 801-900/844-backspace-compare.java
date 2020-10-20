/*
Runtime: 2 ms, faster than 42.29% of Java online submissions for Backspace String Compare.
Memory Usage: 37.7 MB, less than 9.29% of Java online submissions for Backspace String Compare.
*/
class Solution {
  public boolean backspaceCompare(String S, String T) {
    var s1 = new Stack<Character>();
    var s2 = new Stack<Character>();
    
    for(var c : S.toCharArray()) {
      if(c == '#') {
        if(!s1.isEmpty()) s1.pop();
      } else {
        s1.push(c);
      }
    }
    
    for(var c : T.toCharArray()) {
      if(c == '#') {
        if(!s2.isEmpty()) s2.pop();
      } else {
        s2.push(c);
      }
    }
    
    var sb1 = new StringBuilder();
    var sb2 = new StringBuilder();
    
    while(!s1.isEmpty()) {
      sb1.append(s1.pop());
    }
    
    while(!s2.isEmpty()) {
      sb2.append(s2.pop());
    }
    
    return sb1.reverse().toString().equals(sb2.reverse().toString());
  }
}