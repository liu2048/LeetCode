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
        ListNode a = dummy;
        for (int i = 1; i < m; i++) a = a.next;
        
        ListNode start = a.next;
        
        // procedure of reverse a list: three pointers: prev, p, q;
        ListNode pre = null;
        ListNode p = start, q = start.next;
        for (int i = m; i < n; i++){
            p.next = pre;
            pre = p;
            p = q;
            q = q.next;
        }
        // don't forget that p doesn't point to pre after the loops: q is null or out of reversed range
        p.next = pre;
        a.next = p;
        start.next = q;
        return dummy.next;
    }
}