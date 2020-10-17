/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 38.8 MB, less than 8.35% of Java online submissions for Merge Two Sorted Lists.
*/
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    var res = new ListNode(0);
    var ptr = res;
    
    while(l1 != null && l2 != null) {
      if(l1.val < l2.val) {
        ptr.next = l1;
        l1 = l1.next;
      } else {
        ptr.next = l2;
        l2 = l2.next;
      }
      
      ptr = ptr.next;
    }
    
    if(l1 != null) {
      ptr.next = l1;
    }
    
    if(l2 != null) {
      ptr.next = l2;
    }
    
    return res.next;
  }
}