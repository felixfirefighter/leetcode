// Method 1 - Use String
class Solution {
  public int maximum69Number (int num) {
      String numStr = String.valueOf(num);
      StringBuffer sb = new StringBuffer();
      
      boolean switched = false;
      
      for(int i=0;i<numStr.length();i++) {
          char c = numStr.charAt(i);
          if(!switched && c == '6') {
              sb.append("9");
              switched = true;
          } else {
              sb.append(c);
          }
      }
      
      return Integer.parseInt(sb.toString());
  }
}

// Method 2 - Math Magic
// https://leetcode.com/problems/maximum-69-number/discuss/485738/Solution-for-Interview.-One-pass-without-converting-to-string
class Solution {
    public int maximum69Number (int num) {
        // we use a tracker to keep track of the largest digit 6 position
        int number = num;
        int sixPos = -1;
        int curPos = 0;
        while(number > 0) {
            // we start looping from the rightmost digit
            if(number % 10 == 6) {
                sixPos = curPos; 
            }
            number /= 10;
            curPos++;
        }
        
        // all we need to do is add 3(6 + 3 = 9) * the largest digit position 
        return num + (3 * (int) Math.pow(10, sixPos));
    }
}