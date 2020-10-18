class Solution {
  public int jump(int[] nums) {
    if(nums.length < 2) return 0;
    
    var currentMaxIndex = nums[0];
    var preMaxIndex = nums[0];
    var minJump = 1;
    
    for(var i=1;i<nums.length;i++) {
      
      // current index could not jump any further,
      // choose the previous max index
      if(currentMaxIndex < i) {
        minJump++;
        currentMaxIndex = preMaxIndex;
      }      
      
      if(preMaxIndex < nums[i] + i) {
        preMaxIndex = nums[i] + i;
      }
    }
    
    return minJump;
  }
}