class Solution {
  public String toLowerCase(String str) {
      StringBuffer sb = new StringBuffer();
      for(int i=0;i<str.length();i++) {
          // the difference between lower and upper case letter in ASCII is
          // 32
          char c = (char) (str.charAt(i) | (char) (32));
          sb.append(c);
      }
      
      return sb.toString();
  }
}