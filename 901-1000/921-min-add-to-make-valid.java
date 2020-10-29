/*
Runtime: 1 ms, faster than 56.07% of Java online submissions for Minimum Add to Make Parentheses Valid.
Memory Usage: 36.8 MB, less than 18.03% of Java online submissions for Minimum Add to Make Parentheses Valid.
*/
class Solution {
  public int minAddToMakeValid(String S) {
    var stack = new Stack<Character>();
    
    for(var c : S.toCharArray()) {
      if(!stack.isEmpty() && stack.peek() == '(' && c == ')') {
        stack.pop();
      } else {
        stack.add(c);
      }
    }
    
    return stack.size();
  }
}