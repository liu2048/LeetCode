/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return head;
        
        // first traversal, copy
        RandomListNode p = head;
        while (p != null) {
            RandomListNode q = new RandomListNode(p.label);
            q.next = p.next;
            p.next = q;
            p = q.next;
        }
        
        // second traversal, link random
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        
        // third traversal, seperate old and new lists
        p = head;
        RandomListNode newHead = head.next;
        while (p != null) {
            RandomListNode q = p.next;
            p.next = q.next;
            
            if (p.next != null) {
                q.next = p.next.next;
            } 
            p = p.next;
        }
        return newHead;
    }
}
