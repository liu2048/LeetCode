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
        boolean rst = false;
        if (p == null && q == null) rst = true;
        else if (p == null ^ q == null) ; // rst = false
        else if (p.val != q.val) ; // false
        else rst = isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
        return rst;
    }
}