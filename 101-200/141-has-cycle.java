/*
  Runtime: 3 ms, faster than 19.77% of Java online submissions for Linked List Cycle.
  Memory Usage: 39.5 MB, less than 18.02% of Java online submissions for Linked List Cycle.
*/
public class Solution {
  public boolean hasCycle(ListNode head) {
    var set = new HashSet<ListNode>();
    while(head != null) {
      if(set.contains(head)) {
        return true;
      }
      
      set.add(head);
      head = head.next;
    }
      
    
    return false;
  }
}

/*
  Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
  Memory Usage: 38.9 MB, less than 18.02% of Java online submissions for Linked List Cycle.
*/
public class Solution {
  public boolean hasCycle(ListNode head) {
    var fast = head;
    var slow = head;
    
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      
      if(slow == fast) {
        return true;
      }
      
    }
    
    return false;
  }
}