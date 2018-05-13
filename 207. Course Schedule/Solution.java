class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List[] children = new List[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int visited = 0;
        for (int i = 0; i < numCourses; i++) {
            children[i] = new ArrayList<>();
        }
        for (int[] edge : prerequisites) {
            int next = edge[0];
            int prev = edge[1];
            inDegree[next]++;
            children[prev].add(next);
        }    
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
                visited++;
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            List childrenList = children[cur];
            for (int i = 0; i < childrenList.size(); i++) {
                int child = (int) childrenList.get(i);
                inDegree[child]--;
                if (inDegree[child] == 0) {
                    q.offer(child);
                    visited++;
                }
            }
        }
        return visited == numCourses;
    }
}
