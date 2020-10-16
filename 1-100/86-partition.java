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
class Solution {
  public ListNode partition(ListNode head, int x) {
    var lessHead = new ListNode(0);
    var moreHead = new ListNode(0);
    
    var lessPtr = lessHead;
    var morePtr = moreHead;
        
    while(head != null) {
      if(head.val < x) {
        lessPtr.next = head;
        lessPtr = head;
      } else {
        morePtr.next = head;
        morePtr = head;
      }
      
      head = head.next;
    }
    
    lessPtr.next = moreHead.next;
    morePtr.next = null;
    
    return lessHead.next;
    
  }
}