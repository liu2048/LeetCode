/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0, countB = 0;
        // int countB = 0;
        ListNode p = headA;
        ListNode q = headB;
        while (p != null) {
            p = p.next;
            countA++;
        }
        while (q != null) {
            q = q.next;
            countB++;
        }
        p = headA;
        q = headB;
        int diff = countA - countB;
        if (diff > 0) {
            while (diff > 0) {
                p = p.next;
                diff--;
            }
        } else {
            while (diff < 0) {
                q = q.next;
                diff++;
            }
        }
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;        
    }
}
