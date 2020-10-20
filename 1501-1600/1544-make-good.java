/*
Runtime: 3 ms, faster than 53.36% of Java online submissions for Make The String Great.
Memory Usage: 39.4 MB, less than 6.68% of Java online submissions for Make The String Great.
*/
class Solution {
  public String makeGood(String s) {
    var stack = new Stack<Character>();
    
    for(var c : s.toCharArray()) {
      if(stack.isEmpty() || !isBadCharacters(c, stack.peek())) {
        stack.push(c);
      } else {
        stack.pop();
      }
    }
    
    var sb = new StringBuilder();
    while(!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
  }
  
  private boolean isBadCharacters(char c1, char c2) {
    return Character.toLowerCase(c1) == Character.toLowerCase(c2) && ((Character.isUpperCase(c1) && Character.isLowerCase(c2)) || (Character.isUpperCase(c2) && Character.isLowerCase(c1)));
  }
}