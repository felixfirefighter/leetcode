
// O(n), 
// 3ms, 39.15%
// 39.7MB, 16.91%
class Solution {
  public String freqAlphabets(String s) {
      var sb = new StringBuffer();
      
      for(int i=s.length() - 1;i>=0;i--) {
          String sub = s.substring(i,i+1);
          // read the next 2 chars
          // 10# - 26#
          if(sub.equals("#")) {
              sub = s.substring(i-2,i);
              i -= 2;
          }
          char res = toChar(sub);
          sb.append(res);
      }
      return sb.reverse().toString();
  }
  
  private char toChar(String s) {
      int res = Integer.parseInt(s);
      return (char)((int)'a' + res - 1);
  }
}

// Method 2
// O(n), 
// 0ms, 100%
// 37.1MB, 98.07%
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/discuss/470686/Check-i-%2B-2
class Solution {
  public String freqAlphabets(String s) {
      StringBuffer sb = new StringBuffer();
      for(int i=0;i<s.length();i++) {
          if(i < s.length() - 2 && s.charAt(i+2) == '#') {
              int n = (s.charAt(i) - '1') * 10 + (s.charAt(i+1) - '0');
              sb.append((char)('j' + n));
              i += 2;
          } else {
              sb.append((char)('a' + s.charAt(i) - '1'));
          }
      }
      
      return sb.toString();
  }
}