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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> rst = new LinkedList<>();
        if (root == null) return rst;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        boolean leftPushFirst = true;
        while (!st.isEmpty()) {
            Stack<TreeNode> next = new Stack<>();
            List<Integer> list = new LinkedList<>();
            while (!st.isEmpty()) {
                TreeNode cur = st.pop();
                list.add(cur.val);
                TreeNode left = cur.left;
                TreeNode right = cur.right;
                if (leftPushFirst) {
                    if (left != null) next.push(left);
                    if (right != null) next.push(right);
                } else {
                    if (right != null) next.push(right);
                    if (left != null) next.push(left);                    
                } 
            }
            st = next;
            leftPushFirst = !leftPushFirst;     
            rst.add(list);
        } 
        return rst;
    }
}
