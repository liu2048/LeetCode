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
    public void flatten(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> st = new Stack<>();
        TreeNode p = root;
        if (p.right != null) st.push(p.right);
        if (p.left != null) st.push(p.left);
        while (!st.isEmpty()) {
            TreeNode cur = st.pop();
            p.left = null;
            p.right = cur;
            p = cur;
            if (p.right != null) st.push(p.right);
            if (p.left != null) st.push(p.left);            
        }
    }
}
