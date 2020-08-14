// O(n)
// 1 ms, faster than 100.00%
// 37.2 MB, less than 96.79%
class Solution {
  public int longestPalindrome(String s) {
    // A -> 65, z -> 122
    var bucket = new int['z' - 'A' + 1];
    
    for(char c : s.toCharArray()) {
      bucket[c - 'A']++;
    }
    
    var res = 0;
    var hasOdd = false;
    for(int c : bucket) {
      if(c == 1) {
        hasOdd = true;
      } else if(c % 2 == 0) {
        // if the num of char is even, it is palindrome
        res += c;
      } else {
        // for cases like 5, we want to add 4 to res
        res += c - 1;
        hasOdd = true;
      }
    }
    
    return hasOdd ? res + 1 : res;
  }
}

// O(n)
// 3 ms, faster than 66.03%
// 38.8 MB, less than 51.38%
class Solution {
  public int longestPalindrome(String s) {
    int count = 0;
    if(s == null || s.length() == 0) return count;
    
    var set = new HashSet<Character>();
    for(char c : s.toCharArray()) {
      if(set.contains(c)) {
        set.remove(c);
        count++;
      } else {
        set.add(c);
      }
    }
    
    if(set.isEmpty()) return count * 2;
    else return count * 2 + 1;
  }
}