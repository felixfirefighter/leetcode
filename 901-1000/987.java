/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  class Pair {
    TreeNode node;
    int x;
    int y;
    
    Pair(TreeNode node, int x, int y) {
      this.node = node;
      this.x = x;
      this.y = y;
    }
  }
  
  public List<List<Integer>> verticalTraversal(TreeNode root) {
    var lists = new ArrayList<List<Integer>>();
    var map = new HashMap<Integer, List<Pair>>();
    
    Queue<Pair> q = new LinkedList();
    q.add(new Pair(root, 0, 0));
    int min = 0, max = 0;
    while(!q.isEmpty()) {
      var p = q.remove();
      
      min = Math.min(min, p.x);
      max = Math.max(max, p.x);
      
      if(!map.containsKey(p.x)) {
        map.put(p.x, new ArrayList<>());
      }
      map.get(p.x).add(p);
      
      if(p.node.left != null) q.add(new Pair(p.node.left, p.x - 1, p.y + 1));
      if(p.node.right != null) q.add(new Pair(p.node.right, p.x + 1, p.y + 1));
    }
    
    for(int i=min; i<=max; i++) {
      Collections.sort(map.get(i), new Comparator<Pair>() {
        public int compare(Pair a, Pair b) {
          if(a.y == b.y) {
            // if y is equal, sort it by value
            return a.node.val - b.node.val;
          }

          // otherwise don't change the order as 
          // BFS guarantee top nodes are visited first
          return 0;
        }
      });
      
      var list = new ArrayList<Integer>();
      for(int j=0;j<map.get(i).size();j++) {
        list.add(map.get(i).get(j).node.val);
      }
      lists.add(list);
    }
    
    return lists;
  }
}