// Method 1 - Use a stack to track parentheses
class Solution {
  public String removeOuterParentheses(String S) {
      // use a stack to keep track of parentheses
      Stack<Character> stack = new Stack();
      
      // keep the end result
      StringBuffer sb = new StringBuffer();
      
      for(int i=0;i<S.length();i++) {
          char c = S.charAt(i);
          if(c == '(') {
              // if the stack is not empty
              // we know it's not the outermost parentheses
              // because the outermost ( is in the stack
              // add it to StringBuffer
              if(!stack.isEmpty()) {
                  sb.append(c);
              }
              
              stack.push(c);
          } else {
              stack.pop();
              
              if(!stack.isEmpty()) {
                  sb.append(c);
              }
          }
      }
      
      return sb.toString();
  }
}

// Method 2 - Use open to track open and close parentheses
class Solution {
  public String removeOuterParentheses(String S) {
      StringBuffer sb = new StringBuffer();
      int open = 0;
      
      for(int i=0;i<S.length();i++) {
          char c = S.charAt(i);
          
          // +1 when there is a open parentheses
          // -1 when there is a close parentheses
          // Note that open is modified after the
          // evaluation.
          // i.e. "(()())"
          // 1st - '(', open = 0 > 0 -> skip -> open = 1
          // 2nd - '(', open = 1 > 0 -> append -> open = 2 -> "("
          // 3rd - ')', open = 2 > 1 -> append -> open = 1 -> "()"
          // 4th - '(', open = 1 > 0 -> append -> open = 2 -> "()("
          // 5th - ')', open = 2 > 1 -> append -> open = 1 -> "()()"
          // 6th - ')', open = 1 > 1 -> skip -> open = 0
          
          if(c == '(' && open++ > 0) sb.append(c);
          if(c == ')' && open-- > 1) sb.append(c);
      }
      
      return sb.toString();
  }
}