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
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode node) {
        if (node == null) return;
        TreeNode left = node.left;
        TreeNode right = node.right;
        invert(left);
        invert(right);
        node.left = right;
        node.right = left;
    }
}
