class Solution {
    char[][] board;    
    String word;    
    int m, n;
    boolean[][] visited;
    int len;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;        
        this.m = board.length;
        this.n = board[0].length;
        this.visited = new boolean[m][n];
        this.len = word.length();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int x, int y, int index) {
        if (index == len ) return true;        
        if (x < 0 || x > m-1 || y < 0 || y > n-1) return false;
        if (visited[x][y]) return false;
        if (board[x][y] != word.charAt(index)) return false;     
        
        index++;
        visited[x][y] = true;        
        boolean rst = dfs(x-1, y, index) || dfs(x+1, y, index) || dfs(x, y-1, index) || dfs(x, y+1, index);
        visited[x][y] = false;
        
        return rst;
    }
}
