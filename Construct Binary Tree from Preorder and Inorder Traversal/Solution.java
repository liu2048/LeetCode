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
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.map = new HashMap<>();
        int len = inorder.length;
        for (int i = 0; i < len; i++) map.put(inorder[i], i);
        return helper(0, len-1, 0, len-1);
    }
    private TreeNode helper(int preBegin, int preEnd, int inBegin, int inEnd){
        if (preBegin > preEnd || inBegin > inEnd) return null;
        int val = preorder[preBegin];
        int index = map.get(val);
        int len = index - inBegin;
        TreeNode root = new TreeNode(val);
        root.left = helper(preBegin+1, preBegin+len, inBegin, index-1);
        root.right = helper(preBegin+len+1, preEnd, index+1, inEnd);
        return root;
    }
}