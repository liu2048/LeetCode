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