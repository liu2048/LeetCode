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
        boolean order = true;
        while (!st.isEmpty()) {
            int size = st.size();
            Stack<TreeNode> next = new Stack<>();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode head = st.pop();
                list.add(head.val);
                TreeNode left = head.left;
                TreeNode right = head.right;
                if (order) {
                    if (left != null) next.push(left);
                    if (right != null) next.push(right);
                    
                } else {
                    if (right != null) next.push(right);  
                    if (left != null) next.push(left);                              
                }    
            }
            st = next;
            rst.add(list);
            order = !order;            
        }
        return rst;
    }
}
