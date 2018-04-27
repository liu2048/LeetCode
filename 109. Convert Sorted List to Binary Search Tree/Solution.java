/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null; 
        this.node = head;
        ListNode cur = head;  
        int size = 0;  
        while(cur != null) {  
            cur = cur.next;  
            size++;  
        }           
        return helper(0, size - 1);        
    }
    private TreeNode helper(int l, int r) { 
        if (l > r) return null;  
        int m = l + (r-l)/2;  
        TreeNode left = helper(l, m - 1);  
        TreeNode root = new TreeNode(node.val);  
        root.left = left;  
        node = node.next;  
        root.right = helper(m + 1, r);  
        return root;  
    }  
}
