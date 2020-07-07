// Method 1 - Use split
// O(nm) - n = num of array, m = each string length
// 36ms
// 48.1MB
class Solution {
  public List<String> subdomainVisits(String[] cpdomains) {
      var map = new HashMap<String, Integer>();
      for(var cpdomain : cpdomains) {
          // split count and domain
          String[] countAndDomain = cpdomain.split(" ");
          
          // find dot
          while(countAndDomain[1].length() != 0) {
              var count = Integer.parseInt(countAndDomain[0]);
              map.put(countAndDomain[1], map.getOrDefault(countAndDomain[1], 0) + count);    
              var index = countAndDomain[1].indexOf('.');
              if(index == -1) {
                  break;
              }
              
              // get substring after dot,
              // i.e. discuss.leetcode.com
              //      leetcode.com
              countAndDomain[1] = countAndDomain[1].substring(index + 1);
          }
      }
      
      var result = new ArrayList<String>();
      
      for (var entry : map.entrySet()) {
          String domain = entry.getKey();
          Integer count = entry.getValue();
          
          result.add(count + " " + domain);
      }
      
      return result;
  }
}

// Method 2 - use index to split
// O(nm) - n = num of array, m = each string length
// 24ms (38.54%)
// 47.5MB (16.30%)
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        var map = new HashMap<String, Integer>();
        for(var cd : cpdomains) {
            var index = cd.indexOf(' ');
            var count = Integer.valueOf(cd.substring(0, index));
            var domain = cd.substring(index + 1);
            
            map.put(domain, map.getOrDefault(domain, 0) + count);
            for(index=0;index<domain.length();index++) {
                if(domain.charAt(index) == '.') {
                    var s = domain.substring(index+1);
                    map.put(s, map.getOrDefault(s, 0) + count);
                }
            }
        }
        
        var result = new ArrayList<String>();
        
        for (var entry : map.entrySet()) {
            String domain = entry.getKey();
            Integer count = entry.getValue();
            
            result.add(count + " " + domain);
        }
        
        return result;
    }
}