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
        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> q = new LinkedList<>();        
        map.put(node, head);
        q.offer(node);
        while (!q.isEmpty()) {
            UndirectedGraphNode cur = q.poll();
            UndirectedGraphNode mappedCur = map.get(cur);
            for (UndirectedGraphNode neighbor : cur.neighbors) {
                UndirectedGraphNode mappedNeighbor = null;
                if (!map.containsKey(neighbor)) {
                    mappedNeighbor = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor, mappedNeighbor);                    
                    q.offer(neighbor);
                } else {
                    mappedNeighbor = map.get(neighbor);
                }   
                mappedCur.neighbors.add(mappedNeighbor);
            }
        }
        return head;
    }
}
