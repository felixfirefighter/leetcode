/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Use StringBuffer
class Solution {
  public int getDecimalValue(ListNode head) {
      int result = 0;
      StringBuffer sb = new StringBuffer();
      while(head != null) {
          sb.append(head.val);
          head = head.next;
      }
      
      String numInBinary = sb.toString();
      int pow = 0;
      for(int i=numInBinary.length()-1;i>=0;i--) {
          if(numInBinary.charAt(i) == '1') result += Math.pow(2, pow);
          pow++;
      }
      
      return result;
  }
}

// Use Stack
class Solution {
  public int getDecimalValue(ListNode head) {
      int res = 0;
      Stack<Integer> stack = new Stack<Integer>();
      
      while(head != null) {
          // Push from the most significant bit(right side)
          stack.push(head.val);
          head = head.next;
      }
      
      // Pop starting from the least significant bit
      int pow = 0;
      while(!stack.isEmpty()) {
          int val = stack.pop();
          if(val == 1) res += Math.pow(2, pow);
          pow++;
      }
      
      
      return res;
  }
}

// Use Bit Shifting
class Solution {
  public int getDecimalValue(ListNode head) {
      int res = 0;
      
      while(head != null) {
          // shift to the left by 1 to make way for the next bit
          res <<= 1;
          // add val to the least significant bit(the right side)
          res += head.val;
          head = head.next;
      }
      
      return res;
  }
}

// Use Bit Shifting and bitwise OR
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/451815/JavaPython-3-Simulate-binary-operations.
class Solution {
  public int getDecimalValue(ListNode head) {
      int res = 0;
      
      while(head != null) {
          res = (res << 1) | head.val;
          head = head.next;
      }
      
      return res;
  }
}