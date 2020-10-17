/*
Runtime: 6 ms, faster than 39.37% of Java online submissions for Merge k Sorted Lists.
Memory Usage: 40.5 MB, less than 15.01% of Java online submissions for Merge k Sorted Lists.
*/
class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0) return null;
    
    var list = new ArrayList<ListNode>();
    
    for(var i=0;i<lists.length;i++) {
      var head = lists[i];
      while(head != null) {
        list.add(head);
        head = head.next;
      }
    }
    
    if(list.size() == 0) return null;
    
    Collections.sort(list, new Comparator<ListNode>() {
      @Override
      public int compare(ListNode l1, ListNode l2) {
          return Integer.compare(l1.val, l2.val);
      }
    });
    
    for(var i=1;i<list.size();i++) {
      list.get(i-1).next = list.get(i);
    }
    
    list.get(list.size() - 1).next = null;
    
    return list.get(0);
  }
}

/*
Runtime: 2 ms, faster than 92.03% of Java online submissions for Merge k Sorted Lists.
Memory Usage: 40.9 MB, less than 15.01% of Java online submissions for Merge k Sorted Lists.
*/
class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length == 0) return null;
    
    if(lists.length == 1) return lists[0];
    
    if(lists.length == 2) return mergeTwoLists(lists[0], lists[1]);
    
    int mid = lists.length / 2;
    var subList1 = new ListNode[mid];
    var subList2 = new ListNode[lists.length - mid];
    
    for(var i=0;i<mid;i++) {
      subList1[i] = lists[i];
    }
    
    for(var i=mid;i<lists.length;i++) {
      subList2[i-mid] = lists[i]; 
    }
    
    var l1 = mergeKLists(subList1);
    var l2 = mergeKLists(subList2);
    
    return mergeTwoLists(l1, l2);
    
  }
  
  private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
    
    ptr.next = l1 == null ? l2 : l1;
    
    return res.next;
  }
}