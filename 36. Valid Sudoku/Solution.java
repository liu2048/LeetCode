public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] used1 = new boolean[9], used2 = new boolean[9], used3 = new boolean[9];
        int i, j, k;
        for (i = 0; i < 9; i++) {
            Arrays.fill(used1, false);
            Arrays.fill(used2, false);
            for (j = 0; j < 9; j++) {
                if (!isValid(board[i][j], used1)) return false;
                if (!isValid(board[j][i], used2)) return false;
            }
        }

        for (i = 0; i < 9; i += 3){
            for (j = 0; j < 9; j += 3){
                Arrays.fill(used3, false);
                for (k = 0; k < 9; k++){
                    if (!isValid(board[i+k/3][j+k%3], used3)) return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char cha, boolean[] used){
        if (cha != '.'){
            int num = cha - '0';
            if (num < 1 || num > 9 || used[num - 1]) return false;
            used[num - 1] = true;
        }
        return true;
    }
}