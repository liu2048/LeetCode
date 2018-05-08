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
    public List<Integer> rightSideView(TreeNode root) {     
        if (root == null) return new LinkedList<>();
        List<Integer> rst = new LinkedList<>();        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            rst.add(q.peek().val);
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                TreeNode right = node.right;
                TreeNode left = node.left;
                if (right != null) {
                    q.offer(right);
                }
                if (left != null) {
                    q.offer(left);
                }
            }
        }
        return rst;
    }
}
