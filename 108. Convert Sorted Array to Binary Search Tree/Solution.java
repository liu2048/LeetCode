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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        TreeNode root = buildTree(0, nums.length - 1, nums);
        return root;
    }
    private TreeNode buildTree(int start, int end, int[] nums){
        if (start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode rt = new TreeNode(nums[mid]);
        rt.left = buildTree(start, mid-1, nums);
        rt.right = buildTree(mid+1, end, nums);
        return rt;
    }
}