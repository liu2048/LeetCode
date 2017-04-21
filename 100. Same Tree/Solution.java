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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null ^ q == null) return false; // either p or q is null
        if (p == null && q == null) return true; // both p and q are null
        if (p.val != q.val) return false; // neither p nor q is null
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}