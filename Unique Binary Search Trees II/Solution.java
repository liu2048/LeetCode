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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> rst = new ArrayList<>();
        if (n < 1) return rst;
        rst = helper(1, n);
        return rst;
    }
    private List<TreeNode> helper(int begin, int end){
        List<TreeNode> list = new ArrayList<>();
        if (begin > end){
            list.add(null);
            return list;
        }
        for (int i = begin; i <= end; i++){
            List<TreeNode> left = helper(begin, i-1);
            List<TreeNode> right = helper(i+1, end);
            for (int j = 0; j < left.size(); j++){
                for (int k = 0; k < right.size(); k++){
                    TreeNode root = new TreeNode(i);
                    root.left = left.get(j);
                    root.right = right.get(k);
                    list.add(root);
                }
            }
        }
        return list;
    }
}