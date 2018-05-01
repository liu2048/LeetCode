/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int global = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return global;
    }
    public int helper(TreeNode node) {
        if (node == null) return 0;
        int leftMax = helper(node.left);
        int rightMax = helper(node.right);
        int val = node.val;
        int local_sum = Math.max(val, Math.max(val + leftMax, val + rightMax));
        int local = Math.max(local_sum, val + leftMax + rightMax);     
        global = Math.max(global, local);
        return local_sum;
    }
}