
// Method 1 - Use Two ArrayList
class Solution {
  public String destCity(List<List<String>> paths) {
      ArrayList<String> startingCities = new ArrayList();
      ArrayList<String> endingCities = new ArrayList();
      
      for(List<String> path : paths) {
          startingCities.add(path.get(0));
          endingCities.add(path.get(1));
      }
      
      // destination city will not show up as 
      // starting city
      for(String endingCity : endingCities) {
          if(startingCities.indexOf(endingCity) == -1) {
              return endingCity;
          }
      }
      
      return "";
  }
}

// Method 2 - Use Set
// Credit to
// https://leetcode.com/problems/destination-city/discuss/609868/Java-tricky-4-lines-using-one-set
class Solution {
  public String destCity(List<List<String>> paths) {
      // destination city only shows up as ending city
      Set<String> set = new HashSet<String>();
      
      // add ending cities
      for(List<String> path : paths) set.add(path.get(1));
      
      // remove starting cities from set
      for(List<String> path : paths) set.remove(path.get(0));
      
      return set.iterator().next();
  }
}