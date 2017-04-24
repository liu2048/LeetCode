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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rst = new LinkedList<>();
        if (root == null) return rst;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++){
                TreeNode head = q.poll();
                TreeNode left = head.left;
                TreeNode right = head.right;
                list.add(head.val);
                if (left != null){
                    q.offer(left);
                }
                if (right != null) {
                    q.offer(right);
                }
            }
            rst.add(list);
        }
        return rst;
    }
}