class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List[] courses = new List[numCourses];
        int numOfVisited = 0;        
        for (int i = 0; i < numCourses; i++) {
            courses[i] = new ArrayList();
        }        
        for (int[] edge : prerequisites) {
            inDegree[edge[0]]++;
            courses[edge[1]].add(edge[0]);
        }        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
                numOfVisited++;
            }
        }        
        while (!q.isEmpty()) {
            int cur = q.poll();
            List<Integer> nextLevel = courses[cur];
            for (int i = 0; i < nextLevel.size(); i++) {
                int nextCur = (int) nextLevel.get(i);
                inDegree[nextCur]--;
                if (inDegree[nextCur] == 0) {
                    q.offer(nextCur);
                    numOfVisited++;
                }                
            }            
        }        
        if (numOfVisited == numCourses) return true;
        return false;        
    }
}
