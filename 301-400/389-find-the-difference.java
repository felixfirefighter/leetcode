class Solution {
  public char findTheDifference(String s, String t) {
    var bucket = new int[26];
    var bucket2 = new int[26];
    for(var c : s.toCharArray()) {
      bucket[c - 'a']++;
    }
    
    for(var c : t.toCharArray()) {
      bucket2[c - 'a']++;
    }
    
    for(var i=0;i<bucket.length;i++) {
      if(bucket[i] != bucket2[i]) return (char) ('a' + i);
    }
    
    return 'a'; 
  }
}

// https://leetcode.com/problems/find-the-difference/discuss/86850/Simple-JAVA-8ms-solution-4-lines
class Solution {
  public char findTheDifference(String s, String t) {
    int charCode = t.charAt(s.length());
    
    for(var i=0;i<s.length();i++) {
      charCode -= s.charAt(i);
      charCode += t.charAt(i);
    }
    
    return (char) charCode;
  }
}