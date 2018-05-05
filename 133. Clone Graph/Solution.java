/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        Queue<UndirectedGraphNode> q = new LinkedList<>();        
        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        map.put(node, head);        
        q.offer(node);
        while (!q.isEmpty()) {
            UndirectedGraphNode cur = q.poll();
            for (UndirectedGraphNode n : cur.neighbors) {
                if (!map.containsKey(n)) {
                    UndirectedGraphNode nn = new UndirectedGraphNode(n.label);
                    map.put(n, nn);
                    q.offer(n);
                }
                map.get(cur).neighbors.add(map.get(n));                
            }
        }
        return head;
    }
}
