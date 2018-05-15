/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) return null;
        return helper(lists, 0, len-1);        
    }
    public ListNode helper(ListNode[] lists, int begin, int end) {
        ListNode head = null;
        if (end == begin) {
            head = lists[begin];
        } else if (end - begin == 1) {
            head = mergeTwoLists(lists[begin], lists[end]);
        } else {
            int mid = begin + (end-begin)/2;
            ListNode l1 = helper(lists, begin, mid);
            ListNode l2 = helper(lists, mid+1, end);
            head = mergeTwoLists(l1, l2);
        }
        return head;
    }
    
    public ListNode mergeTwoLists(ListNode p, ListNode q) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (p != null && q != null) {
            if (p.val < q.val) {
                cur.next = p;
                p = p.next;
            } else {
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        if (p != null) cur.next = p;
        if (q != null) cur.next = q;
        return dummy.next;
    }
}
