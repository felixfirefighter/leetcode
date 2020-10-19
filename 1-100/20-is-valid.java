/*
Runtime: 1 ms, faster than 99.04% of Java online submissions for Valid Parentheses.
Memory Usage: 37.2 MB, less than 7.87% of Java online submissions for Valid Parentheses.
*/
class Solution {
  public boolean isValid(String s) {
    var stack = new Stack<Character>();
    
    for(var i=0;i<s.length();i++) {
      char c = s.charAt(i);
      if(c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if(stack.empty()) return false;
        
        char cInStack = stack.pop();
        if((c == ')' && cInStack != '(') || (c == '}' && cInStack != '{') || (c == ']' && cInStack != '[')) {
          return false;
        }
      }
    }
    
    return stack.empty();
  }
}

/*
Runtime: 1 ms, faster than 99.04% of Java online submissions for Valid Parentheses.
Memory Usage: 36.9 MB, less than 7.87% of Java online submissions for Valid Parentheses.
*/
class Solution {
  public boolean isValid(String s) {
    var st = new Stack<Character>();
    
    for(char c : s.toCharArray()) {
      if(c == '(') {
        st.push(')');
      } else if(c == '{') {
        st.push('}');
      } else if(c == '[') {
        st.push(']');
      } else if(st.empty() || st.pop() != c) {
        return false;
      }
    }
    
    return st.empty();
  }
}