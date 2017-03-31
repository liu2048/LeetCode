/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2, dummy = new ListNode(0), cur = dummy;
        int carry = 0;
        while (p != null && q != null){
            int x = p.val;
            int y = q.val;
            
            int sum = x + y + carry;
            int digit = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            p = p.next;
            q = q.next;
        }
        
        if (p == null) p = q;
        
        while (p != null){
            int x = p.val;
            int sum = x + carry;
            int digit = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            p = p.next;
        }
        
        if (carry != 0) cur.next = new ListNode(carry);
        
        return dummy.next;
    }
}