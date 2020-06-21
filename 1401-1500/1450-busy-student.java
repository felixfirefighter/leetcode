class Solution {
  public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
      int length = startTime.length;
      int result = 0;
      for(int i=0;i<length;i++) {
          if(startTime[i] <= queryTime && queryTime <= endTime[i]) {
              result += 1;
          }
      }
      
      return result;
  }
}