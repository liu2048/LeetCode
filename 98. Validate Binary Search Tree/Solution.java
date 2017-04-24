/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
// solution 1, inorder traversal, without generating a list
public class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode p = root, pre = null;
        Stack<TreeNode> st = new Stack<>();
        while (p != null || !st.isEmpty()){
            while (p != null){
                st.push(p);
                p = p.left;
            }
            TreeNode cur = st.pop();
            if (pre != null && pre.val >= cur.val) return false;
            pre = cur;
            p = cur.right;
        }
        return true;
    }
}
 
 
// solution 2, use in-order traversal, get a increasing list
public class Solution {
    Stack<Integer> rst = new Stack<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        inOrderTraversal(root);
        int pre = rst.pop();
        while (!rst.isEmpty()){
            int cur = rst.pop();
            if (pre <= cur) return false;
            pre = cur;
        }
        return true;
    }
    private void inOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        while (root != null || !st.isEmpty()){
            if (root != null){
                st.push(root);
                root = root.left;
            }
            else {
                root = st.pop();
                rst.push(root.val);
                root = root.right;
            }
        }
    }
}

// solution 3
public class Solution {
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;
        if (pre != null && pre.val >= root.val) return false;
        pre = root;
        return isValidBST(root.right);
    }
}