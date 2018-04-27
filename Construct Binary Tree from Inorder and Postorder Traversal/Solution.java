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
    int[] inorder;
    int[] postorder;
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        this.map = new HashMap<>();
        int len = inorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, len-1, 0, len-1);
    }
    public TreeNode helper(int postBegin, int postEnd, int inBegin, int inEnd) {
        if (postBegin > postEnd || inBegin > inEnd) return null;
        int val = postorder[postEnd];
        int index = map.get(val);
        int len = index - inBegin;
        TreeNode node = new TreeNode(val);
        node.left  = helper(postBegin, postBegin+len-1, inBegin, index-1);
        node.right = helper(postBegin+len, postEnd-1  , index+1,inEnd);        
        return node;
    }
}
