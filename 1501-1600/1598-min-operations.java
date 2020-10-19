class Solution {
  public int minOperations(String[] logs) {
    
    var stack = new Stack<String>();
    for(var log : logs) {
      if(log.equals("./")) {
        continue;
      } else if(log.equals("../")) {
        if(!stack.empty()) stack.pop();
      } else {
        stack.push(log);
      }
    }
    
    var res = 0;
    while(!stack.empty()) {
      res++;
      stack.pop();
    }
    
    return res;
  }
}