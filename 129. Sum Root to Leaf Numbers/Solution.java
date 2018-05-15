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
    int global;
    public int sumNumbers(TreeNode root) {
        this.global = 0;
        dfs(root, 0);
        return this.global;
    }
    public void dfs(TreeNode root, int sum) {
        if (root == null) return;
        int local = root.val + sum*10;
        if (root.left == null && root.right == null) {
            this.global += local;
        }
        dfs(root.left, local);
        dfs(root.right, local);
    }
}
