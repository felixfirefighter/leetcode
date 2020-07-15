// O(n^2)
// 15ms, 36.84%
// 39.7MB, 51.88%
class Solution {
  public void duplicateZeros(int[] arr) {
      for(var i=0;i<arr.length;i++) {
          if(arr[i] == 0) {
              // push element to the right
              for(var j=arr.length-1;j>=i+1;j--) {
                  arr[j] = arr[j-1];
              }
              i++;
          }
      }
  }
}

// O(n)
// 1ms, 93.94%
// 39.2MB, 95.84%
// https://leetcode.com/problems/duplicate-zeros/discuss/312743/JavaC%2B%2B-O(n)-or-O(1)
class Solution {
  public void duplicateZeros(int[] a) {
      int i = 0, sh = 0;
        for (i = 0; sh + i < a.length; ++i) sh += a[i] == 0 ? 1 : 0;
        for (i = i - 1; sh > 0; --i) {
          if (i + sh < a.length) a[i + sh] = a[i];
          if (a[i] == 0) a[i + --sh] = a[i];
        }
  }
}