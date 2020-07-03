
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