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
        if (root == null) return 0;
        this.global = 0;
        dfs(root, 0);        
        return global;
    }
    public void dfs(TreeNode node, int num) {   
        int curNum = num*10 + node.val;
        TreeNode left = node.left;
        TreeNode right = node.right;        
        if (left == null && right == null) {
            global += curNum;
        }        
        if (left != null) {
            dfs(left, curNum);
        }
        if (right != null) {
            dfs(right, curNum);
        }
    }
}
