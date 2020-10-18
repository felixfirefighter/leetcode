class Solution {
  public boolean canJump(int[] nums) {
    var index = new int[nums.length];
    for(var i=0;i<nums.length;i++) {
      index[i] = i + nums[i];
    }
    
    var maxIndex = index[0];
    var jump = 0;
    while(jump < index.length && jump <= maxIndex) {
      if(maxIndex < index[jump]) {
        maxIndex = index[jump];
      }
      
      jump++;
    }
    
    return jump == index.length;
  }
}