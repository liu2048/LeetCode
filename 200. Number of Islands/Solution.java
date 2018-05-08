class Solution {    
    boolean[][] visited;
    char[][] grid;    
    int m, n;
    public int numIslands(char[][] grid) {
        this.m = grid.length;
        if (m < 1) return 0;
        this.n = grid[0].length;
        if (n < 1) return 0;
        this.grid = grid;
        this.visited = new boolean[m][n];        
        int number = 0;    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    number++;
                    helper(i, j);
                }
            }
        }
        return number;
    }
    public void helper(int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n) return;
        if (grid[x][y] == '0' || visited[x][y]) return;
        visited[x][y] = true;        
        helper(x-1, y); 
        helper(x+1, y); 
        helper(x, y-1); 
        helper(x, y+1);        
    }
}
