class Solution {
    int m, n;
    boolean[][] visited;
    char[][] board;
    public void solve(char[][] board) {
        if (board == null) return;
        
        this.m = board.length;
        if (m < 3) return;
        
        this.n = board[0].length;
        if (n < 3) return;
        
        this.visited = new boolean[m][n];
        this.board = board; 
        
        for (int j = 0; j < n; j++) dfs(0, j);  
        for (int i = 0; i < m; i++) dfs(i, n-1);
        for (int j = n-1; j > -1; j--) dfs(m-1, j);
        for (int i = m-1; i > -1; i--) dfs(i, 0);   
        
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < n-1; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }     
    }
    public void dfs(int x, int y) {
        if (x < 0 || x > m-1 || y < 0 || y > n-1) return;
        if (visited[x][y]) return;
        
        if (board[x][y] == 'O') {
            visited[x][y] = true;
            dfs(x-1, y);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x, y+1);
        }
    }
}
