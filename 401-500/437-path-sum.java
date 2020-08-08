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
// https://leetcode.com/problems/path-sum-iii/discuss/91889/Simple-Java-DFS
// O(n^2)
// 22 ms, faster than 32.13%
// 38.9 MB, less than 94.40%
class Solution {
  public int pathSum(TreeNode root, int sum) {
    if(root == null) return 0;
    return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
  }

  public int pathSumFrom(TreeNode node, int sum) {
    if(node == null) return 0;
    return (node.val == sum ? 1 : 0) + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
  }
}

// Better solution
// https://leetcode.com/problems/path-sum-iii/discuss/91878/17-ms-O(n)-java-Prefix-sum-method
