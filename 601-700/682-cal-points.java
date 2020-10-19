class Solution {
  public int calPoints(String[] ops) {
    var stack = new Stack<Integer>();
    
    for(var c : ops) {
      if(c.equals("+")) {
        var num1 = stack.pop();
        var num2 = stack.pop();
        var sum = num1 + num2;
        
        stack.push(num2);
        stack.push(num1);
        stack.push(sum);
      } else if(c.equals("D")) {
        var num1 = stack.pop();
        var doubleNum = num1 * 2;
        
        stack.push(num1);
        stack.push(doubleNum);
      } else if(c.equals("C")) {
        stack.pop();
      } else {
        int num = Integer.parseInt(c);
        stack.push(num);
      }
    }
    
    var res = 0;
    while(!stack.isEmpty()) {
      res += stack.pop();
    }
    return res;
  }
}