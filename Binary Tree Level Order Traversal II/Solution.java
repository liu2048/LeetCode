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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> rst = new LinkedList<>();
        if (root == null) return rst;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++){
                TreeNode head = q.poll();
                level.add(head.val);
                if (head.left != null) q.offer(head.left);
                if (head.right!= null) q.offer(head.right);
            }
            rst.add(0, level);
        }        
        return rst;
    }
}