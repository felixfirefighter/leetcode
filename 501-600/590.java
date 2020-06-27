/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// O(n), 1ms, 40.2MB
// Recursion
class Solution {
  List<Integer> result = new LinkedList();
  public List<Integer> postorder(Node root) {
      if(root == null) return result;
      
      for(int i=0;i<root.children.size();i++) {
          postorder(root.children.get(i));
      }
      
      result.add(root.val);
      
      return result;
  }
}

// Iteration
// O(n), 2ms, 40.6MB
class Solution {
  public List<Integer> postorder(Node root) {
      LinkedList<Integer> result = new LinkedList();
      
      if(root == null) return result;
      
      Stack<Node> s = new Stack();
      s.push(root);
      while(!s.isEmpty()) {
          root = s.pop();
          for(Node node : root.children) {
              s.push(node);
          }
          result.addFirst(root.val);
      }
      
      return result;
  }
}