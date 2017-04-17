/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = head;
        while (q != null && q.next != null){
            if (q.val == q.next.val){
                int val = q.val;
                while (q != null && q.val == val){
                    p.next = q.next;
                    q = q.next;
                }
            }
            else {
                p.next = q;
                p = p.next;
                q = q.next;
            }
        }
        return dummy.next;
    }
}