/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // find the node just before the start point of reverse
        ListNode pre_start = dummy;
        for (int i = 1; i < m; i++) pre_start = pre_start.next;
        
        ListNode start = pre_start.next;
        
        // procedure of reverse a list: three pointers: prev, p, q;
        ListNode pre = null;
        ListNode p = start, q = start.next;
        for (int i = m; i < n; i++){
            p.next = pre;
            pre = p;
            p = q;
            q = q.next;
        }
        
        // after the loop, p.next is not pre
        // don't forget that p doesn't point to pre after the loops: q is null or out of reversed range
        p.next = pre;
        pre_start.next = p;
        start.next = q;
        return dummy.next;
    }
}