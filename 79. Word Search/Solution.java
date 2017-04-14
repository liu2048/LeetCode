public class Solution {
    char[][] board;
    int m, n;
    String word;
    int len;
    boolean[][] used;
    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        this.board = board;
        this.word = word;
        this.len = word.length();
        this.used = new boolean[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (dfs(0, i, j)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int index, int x, int y){
        if (index == len) return true;
        if (x < 0 || y < 0) return false;
        if (x >= m || y >= n) return false;
        if (used[x][y]) return false;
        if (board[x][y] != word.charAt(index)) return false;
        // (board[x][y] == word.charAt(index))
        used[x][y] = true;
        boolean boo = dfs(index+1, x-1, y) || dfs(index+1, x+1, y) || dfs(index+1, x, y-1) || dfs(index+1, x, y+1);
        used[x][y] = false; // forget this step 
        return boo;
    }
}