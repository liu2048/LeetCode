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
    int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length-1);
    }
    public TreeNode helper(int begin, int end) {
        if (begin > end) return null;
        int mid = begin + (end-begin)/2;
        int val = nums[mid];
        TreeNode node = new TreeNode(val);
        node.left  = helper(begin, mid-1);
        node.right = helper(mid+1, end);
        return node;
    }
}
