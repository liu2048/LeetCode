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
        if (root == null) return rst;
        List<Integer> vals = new LinkedList<>();
        Stack<TreeNode> curLevel = new Stack<>();
        Stack<TreeNode> nxtLevel = new Stack<>();
        boolean normal = true;
        curLevel.push(root);
        while (!curLevel.isEmpty()){
            int size = curLevel.size();
            for (int i = 0; i < size; i++){
                TreeNode cur = curLevel.pop();
                vals.add(cur.val);
                if (normal){
                    if (cur.left != null) {
                        nxtLevel.push(cur.left);
                    }
                    if (cur.right != null) {
                        nxtLevel.push(cur.right);
                    }
                }
                else {
                    if (cur.right != null) {
                        nxtLevel.push(cur.right);
                    }
                    if (cur.left != null) {
                        nxtLevel.push(cur.left);
                    }
                }
            }
            normal = !normal;
            rst.add(vals);
            curLevel = nxtLevel;
            vals = new LinkedList<>();
            nxtLevel = new Stack<>();
        }
        return rst;
    }
}