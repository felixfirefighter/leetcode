/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Copy List with Random Pointer.
Memory Usage: 38.7 MB, less than 16.76% of Java online submissions for Copy List with Random Pointer.
*/

class Solution {
  public Node copyRandomList(Node head) {
    var map = new HashMap<Node, Integer>();
    var list = new ArrayList<Node>();
    var ptr = head;
    var i = 0;
    
    while(ptr != null) {
      list.add(new Node(ptr.val));
      map.put(ptr, i++);
      ptr = ptr.next;
    }
    
    list.add(null);
    ptr = head;
    i = 0;
    while(ptr != null) {
      list.get(i).next = list.get(i+1);
      if(ptr.random != null) {
        var id = map.get(ptr.random);
        list.get(i).random = list.get(id);
      }
      ptr = ptr.next;
      i++;
    }
    
    return list.get(0);
  }
}