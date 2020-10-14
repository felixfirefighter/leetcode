/*
  Runtime: 7 ms, faster than 27.53% of Java online submissions for Intersection of Two Linked Lists.
  Memory Usage: 42.4 MB, less than 17.10% of Java online submissions for Intersection of Two Linked Lists.
*/
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) return null;
    
    var s = new HashSet<ListNode>();
    
    while(headA != null) {
      s.add(headA);
      headA = headA.next;
    }
    
    while(headB != null) {
      if(s.contains(headB)) {
        return headB;
      }
      headB = headB.next;
    }
    
    return null;
  }
}

/**
  Runtime: 1 ms, faster than 98.96% of Java online submissions for Intersection of Two Linked Lists.
  Memory Usage: 41.6 MB, less than 17.10% of Java online submissions for Intersection of Two Linked Lists.
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) return null;
    
    int aLen = getLen(headA);
    int bLen = getLen(headB);
    
    if(aLen > bLen) {
      headA = forwardListNode(headA, aLen - bLen);
    } else {
      headB = forwardListNode(headB, bLen - aLen);
    }
    
    while(headA != null && headB != null) {
      if(headA == headB) {
        return headA;
      }
      
      headA = headA.next;
      headB = headB.next;
    }
    
    
    return null;
    
  }
  
  private int getLen(ListNode node) {
    int count = 0;
    while(node != null) {
      node = node.next;
      count++;
    }
    
    return count;
  }
  
  private ListNode forwardListNode(ListNode node, int count) {
    while(node != null && count > 0) {
      node = node.next;
      count--;
    }
    return node;
  }
}