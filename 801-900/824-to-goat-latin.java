// 22 ms, faster than 5.63%
// 40.4 MB, less than 13.01%
class Solution {
  public String toGoatLatin(String S) {
    
    String[] strArr = S.split(" ");
    var vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    var a = "a";

    for(var i=0;i<strArr.length;i++) {
      var str = strArr[i];
      if(!vowels.contains(str.charAt(0))) {
        str = str.substring(1) + str.charAt(0);
      } 
      
      str += "ma" + a;
      a += "a";
      
      strArr[i] = str;
    }
                                        
    return String.join(" ", strArr);
  }
}

// https://leetcode.com/problems/goat-latin/discuss/128368/Java-2-ms-solution-with-time-and-space-complexity-explanation
// 5 ms, faster than 56.35%
// 40 MB, less than 25.27%
class Solution {
  public String toGoatLatin(String S) {
    var vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    
    var sb = new StringBuffer();
    var suffix = new StringBuffer("a");
    
    for(var str : S.split(" ")) {
      if(sb.length() != 0) {
        sb.append(" ");
      }
      
      var firstChar = str.charAt(0);
      if(vowels.contains(firstChar)) {
        sb.append(str);
      } else {
        sb.append(str.substring(1));
        sb.append(firstChar);
      }
      
      sb.append("ma").append(suffix);
      suffix.append("a");
    }
    
    return sb.toString();
  }
}