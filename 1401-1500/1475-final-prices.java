// Method 1 - two loops
class Solution {
  public int[] finalPrices(int[] prices) {
      for(int i=0;i<prices.length;i++) {
          for(int j=i+1;j<prices.length;j++) {
              if(prices[j] <= prices[i]) {
                  prices[i] -= prices[j];
                  break;
              }
          }    
      }
      
      return prices;
  }
}

// Method 2 - Use stack
// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/discuss/685329/Java-O(n)-1-pass-code-using-stack-w-brief-explanation-and-analysis.
class Solution {
  public int[] finalPrices(int[] prices) {
      
      int[] res = prices.clone();
      
      // Use a stack to keep track of the index
      Stack<Integer> stack = new Stack();
      
      
      for(int i=0;i<prices.length;i++) {
          // Whenever the price in the stack is larger than the current price,
          // we deduct the current price from the price(index) in the stack
          // i.e. [4,6,2]
          // 1st - 4 -> stack - [4]
          // 2nd - 6 -> larger than 4, will not pop -> [6, 4]
          // 3rd - 2 -> smaller than 6, give a discount, pop -> [4]
          // 6 - 2 = 4
          // stack is not empty, continue loop -> 2 -> less than 4 in the stack
          // pop -> []
          // 4 -2 = 2
          // ans = [2, 4, 2]
          while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
              int index = stack.pop();
              res[index] -= prices[i];
          }
          
          // push the index to the stack
          stack.push(i);
      }
      
      return res;
  }
}