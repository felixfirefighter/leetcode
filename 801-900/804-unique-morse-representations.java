class Solution {
  public int uniqueMorseRepresentations(String[] words) {
      String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      
      Set<String> set = new HashSet<String>();
      for(String word : words) {
          
          StringBuffer sb = new StringBuffer();
          for(int i=0;i<word.length();i++) {
              char c = word.charAt(i);
              String code = morseCodes[(int) c - 'a'];
              sb.append(code);
          }
          
          set.add(sb.toString());
      }
      
      return set.size();
  }
}