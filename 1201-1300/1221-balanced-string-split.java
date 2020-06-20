// Using stack
// We push to the stack if the existing character in the stack
// is the same as current character
// Whenever the stack is empty, increment count by 1
class Solution {
  public int balancedStringSplit(String s) {
      Stack<Character> stack = new Stack<Character>();
      int count = 0;
      
      stack.push(s.charAt(0));
      
      for(int i=1;i<s.length();i++) {
          char c = s.charAt(i);
          
          if(stack.isEmpty()) {
              count++;
              stack.push(c);
          } else {
              char charInStack = stack.peek();
              if(charInStack == c) {
                  stack.push(c);
              } else {
                  stack.pop();
              }
          }
      }
      
      if(stack.isEmpty()) count ++;
      
      return count;
  }
}

// Using count,
// We decrement count by 1 if it is L
// We increment count by 1 if it is R
// Whenever count is 0, we know the string is balance
// add result by 1
class Solution {
  public int balancedStringSplit(String s) {
      int result = 0;
      int count = 0;
      for(int i=0;i<s.length();i++) {
          char c = s.charAt(i);
          count += c == 'L' ? -1 : 1;
          if(count == 0) result++;
      }
      
      return result;
  }
}