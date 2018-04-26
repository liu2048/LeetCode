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
    public boolean isSameTree(TreeNode p, TreeNode q) { 
        if (p == null ^ q == null) return false;
        
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        
        if (p != null) {
            st1.push(p);
        }
        if (q != null) {
            st2.push(q);
        }        
        while (!st1.isEmpty() && !st2.isEmpty()){
            TreeNode cur1 = st1.pop();
            TreeNode cur2 = st2.pop();
            
            if (cur1.val != cur2.val) return false; 
            if (cur1.left == null ^ cur2.left == null) return false;
            if (cur1.right == null ^ cur2.right == null) return false;
            
            if (cur1.right != null && cur2.right != null) {
                st1.push(cur1.right);
                st2.push(cur2.right);
            }            
            if (cur1.left != null && cur2.left != null) {
                st1.push(cur1.left);
                st2.push(cur2.left);
            }  
        }
        return true;   
    }
}
