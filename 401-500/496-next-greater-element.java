class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    var map = new HashMap<Integer, Integer>();
    var stack = new Stack<Integer>();
    
    for(var num : nums2) {
      while(!stack.empty() && stack.peek() < num) {
        map.put(stack.pop(), num);
      }
      stack.push(num);
    }
    
    for(var i=0;i<nums1.length;i++) {
      nums1[i] = map.getOrDefault(nums1[i], -1);
    }
    
    return nums1;
  }
}