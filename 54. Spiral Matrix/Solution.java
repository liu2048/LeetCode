public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rst = new LinkedList<>();
        if (matrix == null) return rst;
        int m = matrix.length;
        if (m == 0) return rst;
        if (matrix[0] == null) return rst;
        int n = matrix[0].length;
        if (n == 0) return rst;
        
        int x = 0, y = 0;
        while ( m > 1 && n > 1){
            for (int j = 0; j < n - 1; j++) rst.add(matrix[x][y++]);
            for (int j = 0; j < m - 1; j++) rst.add(matrix[x++][y]);
            for (int j = 0; j < n - 1; j++) rst.add(matrix[x][y--]);
            for (int j = 0; j < m - 1; j++) rst.add(matrix[x--][y]);
            x++;
            y++;
            m -= 2;
            n -= 2;
        }
        if (m == 1) for (int j = 0; j < n; j++) rst.add(matrix[x][y++]);
        else if (n == 1) for (int j = 0; j < m; j++) rst.add(matrix[x++][y]);
        return rst;
    }
}