class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max = 0;
      for(int i=0;i<candies.length;i++) {
          if(candies[i] > max) max = candies[i];
      }
      
      List<Boolean> result = new LinkedList<Boolean>();
      for(int i=0;i<candies.length;i++) {
          Boolean isGreatest = candies[i] + extraCandies >= max;
          result.add(isGreatest);
      }
      
      return result;
  }
}