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

// Method 1 - Recursion
// O(n), 0ms, 39.9MB
class Solution {
  public List<Integer> result = new LinkedList<Integer>();
  public List<Integer> preorder(Node root) {
      if(root == null) return result;
      
      result.add(root.val);
      for(Node node : root.children) {
          preorder(node);
      }
      
      return result;
  }
}

// Iterative
class Solution {
  public List<Integer> preorder(Node root) {
      List<Integer> result = new LinkedList<Integer>();
      
      if(root == null) return result;
      
      Stack<Node> s = new Stack();
      s.add(root);
      while(!s.isEmpty()) {
          root = s.pop();
          result.add(root.val);
          for(int i=root.children.size()-1;i>=0;i--) {
              s.add(root.children.get(i));
          }
      }
      
      return result;
  }
}