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
    int[] inorder;
    int[] postorder;
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        int len = inorder.length;
        map = new HashMap<>();
        for (int i = 0;  i < len; i++) map.put(inorder[i], i);
        return helper(0, len-1, 0, len-1);
    }
    private TreeNode helper(int inBegin, int inEnd, int postBegin, int postEnd){
        if (inBegin > inEnd || postBegin > postEnd) return null;
        int val = postorder[postEnd];
        int index = map.get(val);
        int len = index - inBegin;
        TreeNode root = new TreeNode(val);
        root.left = helper(inBegin, index-1, postBegin, postBegin+len-1);
        root.right = helper(index+1, inEnd,postBegin+len, postEnd-1);
        return root;
    }
}