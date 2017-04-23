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
        List<Integer> vals = new LinkedList<>();
        Queue<TreeNode> curLevel = new LinkedList<>();
        Queue<TreeNode> nxtLevel = new LinkedList<>();
        curLevel.offer(root);
        while (!curLevel.isEmpty()){
            TreeNode cur = curLevel.poll(); // queue: poll() return and delete the first; element() & peek() return the first;
            if (cur.left != null) nxtLevel.offer(cur.left);
            if (cur.right != null) nxtLevel.offer(cur.right);
            vals.add(cur.val);
            if (curLevel.isEmpty()){
                curLevel = nxtLevel;
                rst.add(vals);
                nxtLevel = new LinkedList<>();
                vals = new LinkedList<>();
            }
        }
        return rst;
    }
}