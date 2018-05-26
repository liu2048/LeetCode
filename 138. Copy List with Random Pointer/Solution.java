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
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode q = dummy;
        RandomListNode p = head;     
        while (p != null) {
            q.next = new RandomListNode(p.label);
            q = q.next;
            map.put(p, q);
            p = p.next;
        }
        p = head;
        q = dummy.next;
        while (p != null) {
            q.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }
        return dummy.next;
    }
}
