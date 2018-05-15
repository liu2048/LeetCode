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
        if (root == null) return 0;
        helper(root);
        return global;
    }
    public int helper(TreeNode node) { 
        if (node == null) return 0;
        int val = node.val;   
        int left = helper(node.left);
        int right = helper(node.right);  
        int localSumNode = Math.max(val, Math.max(left+val, right+val));
        int local = Math.max(localSumNode, left + right + val);
        this.global = Math.max(this.global, local);        
        return localSumNode;
    }
}
