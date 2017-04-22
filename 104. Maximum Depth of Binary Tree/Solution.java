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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

// another version
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        
        return 1 + Math.max(leftMaxDepth, rightMaxDepth);
    }
}


/*
// one-line code
public class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
*/