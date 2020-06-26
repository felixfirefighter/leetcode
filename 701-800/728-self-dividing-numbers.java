// O(nm)
// n = number between left to right
// m = digit of each number
class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> result = new ArrayList<Integer>();
      for(int i=left;i<=right;i++) {
          if(isSelfDividing(i)) {
              result.add(i);
          }
      }
      return result;
  }
  
  public boolean isSelfDividing(int num) {
      int number = num;
      while(number > 0) {
          int digit = number % 10;
          
          // self dividing num cannot contain 0
          if(digit == 0 || num % digit != 0) {
              return false;
          }
          
          number /= 10;
      }
      
      return true;
  }
}