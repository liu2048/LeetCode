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
    public List<Integer> preorderTraversal(TreeNode root) {        
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while ( !st.empty() ) {
            TreeNode cur = st.pop();
            list.add(cur.val);
            if (cur.right != null) {
                st.push(cur.right);
            }
            if (cur.left != null) {
                st.push(cur.left);
            }
        }
        return list;
    }
}