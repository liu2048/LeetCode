/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode sorted = head;
        ListNode cur = head.next;
        sorted.next = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;        
            cur.next = null;
            insert(cur, dummy);
            cur = next;                
        }
        return dummy.next;
    }
    public void insert(ListNode toInsert, ListNode dummy) {
        int val = toInsert.val;
        ListNode pre = dummy;
        ListNode cur = dummy.next;        
        while (cur != null && val > cur.val) {
            pre = cur;
            cur = cur.next;            
        }
        pre.next = toInsert;
        toInsert.next = cur;
    }    
}
