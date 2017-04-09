public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] rst = new int[n][n];
        int x = 0, y = 0;
        int num = 1;
        int size = n;
        while (size > 1){
            for (int i = 0; i < size - 1; i++) rst[x][y++] = num++;
            for (int i = 0; i < size - 1; i++) rst[x++][y] = num++;
            for (int i = 0; i < size - 1; i++) rst[x][y--] = num++;
            for (int i = 0; i < size - 1; i++) rst[x--][y] = num++;
            x++;
            y++;
            size -= 2;
        }
        if (size == 1) rst[x][y] = num;
        return rst;
    }
}