/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);
        
        if (leftMinDepth == 0) return 1 + rightMinDepth;
        if (rightMinDepth == 0) return 1 + leftMinDepth;
        
        return 1 + Math.min(leftMinDepth, rightMinDepth);
    }
}