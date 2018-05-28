/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = reverse(l1);
        ListNode q = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = carry + x + y;
            int digit = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        ListNode temp = dummy.next;
        dummy.next = null;
        return reverse(temp);
    }
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null, cur = head, nxt = null;
        while (cur != null) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
