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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> rst = new LinkedList<>();
        if (root == null) {
            return rst;
        }
        Stack<TreeNode> cur = new Stack<>();
        Stack<TreeNode> nxt = new Stack<>();
        List<Integer> list = new LinkedList<>();
        boolean normalOrder = true;
        cur.push(root);
        while (!cur.isEmpty()){
            TreeNode top = cur.pop();
            list.add(top.val);
            if (normalOrder){
                if (top.left != null){
                    nxt.push(top.left);
                }
                if (top.right != null){
                    nxt.push(top.right);
                }
            }
            else {
                if (top.right != null){
                    nxt.push(top.right);
                }
                if (top.left != null){
                    nxt.push(top.left);
                }
            }
            if (cur.isEmpty()){
                normalOrder = !normalOrder;
                rst.add(list);
                list = new LinkedList<>();
                cur = nxt;
                nxt = new Stack<>();
            }
        }
        return rst;
    }
}