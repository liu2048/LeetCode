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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<Integer> st2 = new Stack<>();
        if (root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.empty()) {
            TreeNode cur = st.pop();
            st2.push(cur.val);
            if (cur.left != null) {
                st.push(cur.left);
            }
            if (cur.right != null) {
                st.push(cur.right);
            }
        }
        while (!st2.empty()) {
            list.add(st2.pop());
        }
        return list;
    }
}