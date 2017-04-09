/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 1;
        ListNode p = head;
        while (p.next != null) {
            len++;
            p = p.next;
        }
        
        k %= len;
        if (k == 0) return head;// not necessary
        
        p.next = head;
        
        
        for (int i = 0; i < len - k; i++){
            p = p.next;
        }
        
        ListNode newHead = p.next;
        p.next = null;
        return newHead;
    }
}