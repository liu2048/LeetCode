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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        int diff = sum - root.val;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) {
            if (diff == 0) {
                return true;
            } else {
                return false;
            }
        }
        return hasPathSum(left, diff) || hasPathSum(right, diff);
    }
}
