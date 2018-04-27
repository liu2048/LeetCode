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
    public boolean isBalanced(TreeNode root) {
        if (depth(root) == -1) return false;
        return true;
    }
    public int depth(TreeNode node) {
        // return -1 if not balancde
        if (node == null) return 0;
        int l_depth = depth(node.left);
        int r_depth = depth(node.right);
        if (l_depth == -1 || r_depth == -1) return -1;
        if (Math.abs(l_depth - r_depth) > 1) return -1;
        return Math.max(l_depth, r_depth) + 1;
    }
}
