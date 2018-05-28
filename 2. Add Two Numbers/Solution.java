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
        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2, cur = dummy;
        int carry = 0;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = carry + x + y;
            int digit = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(digit);
            cur  = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        return dummy.next;
    }
}
