/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Partition List.
Memory Usage: 38 MB, less than 19.10% of Java online submissions for Partition List.
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