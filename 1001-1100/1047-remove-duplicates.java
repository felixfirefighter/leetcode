class Solution {
  public String removeDuplicates(String S) {
    var stack = new Stack<Character>();
    
    for(var c : S.toCharArray()) {
      if(stack.isEmpty()) {
        stack.push(c);
      } else {
        if(stack.peek() == c) stack.pop();
        else stack.push(c);
      }
    }
    
    var sb = new StringBuilder();
    while(!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    
    return sb.reverse().toString();
  }
}