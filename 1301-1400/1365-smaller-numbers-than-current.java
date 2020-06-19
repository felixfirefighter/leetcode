// O(n) solution, count in a bucket
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // 0 <= nums[i] <= 100, so there is 101 
        // different possible number
        int[] count = new int[101];
        int[] result = new int[nums.length];
        
        // store the occurence of each number in the bucket
        // i.e. number 7 shows up twice
        // nums[7] = 2
        for(int i=0;i<nums.length;i++) {
            count[nums[i]]++;
        }
        
        // We try to find the number that is smaller than the current number.
        // We know that count[] consists of the number in ascending order
        // count[0], count[1], count[2]...
        // so if we want to know the all the smaller number than current number,
        // we just have to sum up all occurence of the previous(smaller) number
        // with the occurence of current number
        // i.e. [2,0,0,1]
        // Before sum
        // count[0] = 2
        // count[1] = 1
        // count[2] = 1
        // After sum
        // count[0] = 0
        // count[1] = 3
        // count[2] = 4
        
        // the count of smaller would be i-1 because we want to exclude the
        // number (we want smaller number, not smaller or equal to)
        for(int i=1;i<count.length;i++) {
            count[i] += count[i-1];
        }
        
        for(int i=0;i<nums.length;i++) {
            // there won't be a number less than 0
            if(nums[i] == 0) result[i] = 0;
            else result[i] = count[nums[i]-1];
        }
        return result;
    }
    
}

// O(n^2) solution
// class Solution {
//   public int[] smallerNumbersThanCurrent(int[] nums) {
//       int[] result = new int[nums.length];
//       for(int i=0;i<nums.length;i++) {
//           for(int j=0;j<nums.length;j++) {
//               if(i != j && nums[j] < nums[i]) {
//                   result[i] += 1;
//               }
//           }
//       }
//       return result;
//   }
// }

