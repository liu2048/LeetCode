/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 // preorder traversal
 public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> st = new Stack<>();
        TreeNode pre = root;
        if (pre.right != null) st.push(pre.right);
        if (pre.left != null) st.push(pre.left);
        while (!st.isEmpty()){
            TreeNode cur = st.pop();
            if (cur.right != null) st.push(cur.right);
            if (cur.left != null) st.push(cur.left);
            pre.left = null;
            pre.right = cur;
            pre = cur;
        }
    }
} 
 
// with a queue
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> st = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode top = st.pop();
            q.offer(top);
            if (top.right != null){
                st.push(top.right);
            }
            if (top.left != null){
                st.push(top.left);
            }
        }
        TreeNode node = q.poll();
        while (!q.isEmpty()){
            node.left = null;
            node.right = q.poll();
            node = node.right;
        }
    }
}