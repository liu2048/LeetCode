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
        ListNode p = dummy;
        ListNode q = head;
        dummy.next = head;
        while (q != null && q.next != null){
            if (q.val == q.next.val){
                int val = q.val;
                while (q != null && val == q.val) q = q.next;
                p.next = q;
            }
            else{
                p = q;
                q = q.next;
            }
            
        }
        return dummy.next;
    }
}