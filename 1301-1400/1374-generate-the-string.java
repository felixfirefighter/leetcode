class Solution {
  public String generateTheString(int n) {
      char[] result = new char[n];
      for(int i=0;i<n;i++) {
          result[i] = 'a';
      }
      
      if(n % 2 == 0) result[0] = 'b';
      
      return new String(result);
  }
}