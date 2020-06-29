class Solution {
  public int heightChecker(int[] heights) {
      int[] count = new int[101];
      
      for(var height : heights) {
          count[height]++;
      }
      
      int curHeight = 0;
      int result = 0;
      
      for(var height : heights) {
          // skip count[height] that is empty
          // that means count[height] = 0
          while(count[curHeight] == 0) {
              curHeight++;
          }
          
          // in count[], the height is "sorted" from 1 to 100
          // height 1 stored in count[1]
          // height 2 stored in count[2]...
          // if curHeight in count is not the same as
          // the height in heights[], it means the element
          // has been moved
          // [1,1,4,2,1,3]
          // [1,1,1,2,3,4] 
          // [    ^   ^ ^]
          if(curHeight != height) {
              result++;
          }
          
          count[curHeight]--;
      }
      
      return result;
  }
}