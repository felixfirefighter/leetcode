
// 17ms, 24.17%
// 47.2MB, 13.51%
class Solution {
  public String reverseWords(String s) {
      var sb = new StringBuffer();
      var startIndex = 0;
      for(var i=0;i<s.length();i++) {
          if(s.charAt(i) == ' ') {
              appendReversely(s, sb, startIndex, i);

              // append a space
              sb.append(" ");
              
              startIndex = i + 1;
          }
      }
      
      // append the last word
      appendReversely(s, sb, startIndex, s.length());
      
      return sb.toString();
  }
  
  private void appendReversely(String s, StringBuffer sb, int startIndex, int endIndex) {
      // Get word from the word
      var str = s.substring(startIndex, endIndex);
      // append the word from the end
      for(var j=str.length() - 1;j>=0;j--) {
          sb.append(str.charAt(j));
      }
  }
}