/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode curHead, cur = null, nextHead = null, next = null;
        curHead = root;
        while (curHead != null) {
            cur = curHead;
            while (cur != null) {
                TreeLinkNode curLeft = cur.left;
                TreeLinkNode curRight = cur.right;
                if (curLeft != null) {
                    if (nextHead == null) {
                        nextHead = curLeft;
                        next = nextHead;
                    } else {
                        next.next = curLeft;
                        next = next.next;
                    }
                }
                if (curRight != null) {
                    if (nextHead == null) {
                        nextHead = curRight;
                        next = nextHead;
                    } else {
                        next.next = curRight;
                        next = next.next;
                    }
                }
                cur = cur.next;
            }
            curHead = nextHead;
            nextHead = null;
        }
    }
}
