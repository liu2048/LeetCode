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
    int[] preorder;    
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.inorder = inorder;
        this.preorder = preorder;                
        this.map = new HashMap<>();
        int len = inorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, len-1, 0, len-1);
    }
    public TreeNode helper(int preBegin, int preEnd, int inBegin, int inEnd) {
        if (preBegin > preEnd || inBegin > inEnd) return null;
        int val = preorder[preBegin];
        int index = map.get(val);
        int len = index - inBegin;
        TreeNode node = new TreeNode(val);
        node.left  = helper(preBegin+1, preBegin+len, inBegin, index-1);
        node.right = helper(preBegin+len+1, preEnd  , index+1, inEnd);
        return node;
    }
}
