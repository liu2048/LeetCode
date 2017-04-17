/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head; // not necessary
        ListNode dummy_small = new ListNode(0);
        ListNode small = dummy_small;
        
        ListNode dummy_big = new ListNode(0);
        ListNode big = dummy_big;
        
        ListNode p = head;
        while (p != null){
            int curVal = p.val;
            if (curVal < x){
                small.next = p;
                small = small.next;
            }
            else {
                big.next = p;
                big = big.next;
            }
            p = p.next;
        }
        small.next = dummy_big.next;
        big.next = null;
        return dummy_small.next;
    }
}