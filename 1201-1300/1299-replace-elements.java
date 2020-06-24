class Solution {
  public int[] replaceElements(int[] arr) {
      
      int highest = arr[arr.length-1];
      
      // set the last element to -1
      arr[arr.length-1] = -1;
      
      // start from the second last element
      for(int i=arr.length-2;i>=0;i--) {
          int temp = highest;
          
          if(arr[i] > highest) {
              highest = arr[i];
          }
          
          arr[i] = temp;
      }
      
      return arr;
  }
}