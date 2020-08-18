class Solution {
  public int[] numsSameConsecDiff(int N, int K) {
    var res = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    for(var i=2;i<=N;i++) {
      var list = new ArrayList<Integer>();
      for(var num : res) {
        var lastDigit = num % 10;
        if(num > 0 && lastDigit + K < 10) {
          list.add(num * 10 + lastDigit + K);
        }
        
        if(num > 0 && K > 0 && lastDigit - K >= 0) {
          list.add(num * 10 + lastDigit - K);
        }
      }
      res = list;
    }
    
    return res.stream().mapToInt(i -> i).toArray();
  }
}