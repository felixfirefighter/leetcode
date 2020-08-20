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
// https://leetcode.com/problems/reorder-list/discuss/44992/Java-solution-with-3-steps
// O(n)
// 1 ms, faster than 99.96%
// 42.3 MB, less than 73.85%
class Solution {
  public void reorderList(ListNode head) {
    if(head == null || head.next == null) return;
    
    ListNode slow = head;
    ListNode fast = head.next;
    
    // find the mid point
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    
    // reverse the last half of the list node
    ListNode head2 = reverse(slow.next);
    slow.next= null;
    
    // merge two halves
    merge(head, head2);
  }

  private ListNode reverse(ListNode node) {
    ListNode prev = null;
    ListNode current = node;
    while(current != null) {
      ListNode next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    
    return prev;
  }

  private void merge(ListNode head1, ListNode head2) {
    while(head2 != null) {
      ListNode next = head1.next; // store first half next
      head1.next = head2; // set first half next to head2
      head1 = head2; // set first half head to second half head
      head2 = next; 
    }
  }
}