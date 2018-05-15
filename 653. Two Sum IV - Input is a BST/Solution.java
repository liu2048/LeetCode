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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        Set<Integer> set = new HashSet<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            if (!set.contains(k - cur.val)) {
                set.add(cur.val);
            } else {
                return true;
            }            
            cur = cur.right;
        }
        return false;
    }
}
