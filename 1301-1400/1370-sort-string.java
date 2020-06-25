// Method 1 - Use count
// O(n), 7ms, 40.6MB
class Solution {
  public String sortString(String s) {
      // 26 lowercase alphabets
      int[] count = new int[26];
      
      for(int i=0;i<s.length();i++) {
          char c = s.charAt(i);
          
          // i.e. count['a' - 'a'] = count[0]
          // count['z' - 'a'] = count[25];
          count[(int) (c - 'a')]++;
      }
      
      StringBuffer sb = new StringBuffer();
      
      // start from 0, smallest character first
      int pointer = 0;
      int direction = 1;
      
      while(sb.length() < s.length()) {
          if(count[pointer] != 0) {
              sb.append((char) ('a' + pointer));
              count[pointer]--;
          }
          
          pointer += direction;
          
          if(pointer == count.length) {
              // move backward
              direction = -1;
              pointer = count.length - 1;
          } else if(pointer == -1) {
              // move forward
              direction = 1;
              pointer = 0;
          }
      }
      
      return sb.toString();
  }
}

// Method 2 - Use count
// O(n), 3ms, 39.4MB
class Solution {
  public String sortString(String s) {
      // 26 lowercase alphabets
      int[] count = new int[26];
      for(int i=0;i<s.length();i++) {
          char c = s.charAt(i);
          // i.e. count['a' - 'a'] = count[0]
          // count['z' - 'a'] = count[25];
          count[(int) (c - 'a')]++;
      }
      
      StringBuffer sb = new StringBuffer();
      int length = 0;
      while(length < s.length()) {
          for(int i=0;i<count.length;i++) {
              if(count[i] > 0) {
                  sb.append((char)('a' + i));
                  count[i]--;
                  length++;
              }
          }
          
          for(int i=count.length-1;i>=0;i--) {
              if(count[i] > 0) {
                  sb.append((char)('a' + i));
                  count[i]--;
                  length++;
              }
          }
      }
      
      return sb.toString();
  }
}