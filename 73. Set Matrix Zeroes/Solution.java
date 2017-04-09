public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;
        
        // check if there is a zero in the first column
        for (int i = 0; i < m; i++){
            if (matrix[i][0] == 0){
                isFirstColZero = true;
                break;
            }
        }
        
        // similarly, check if there is a zero in the first row
        for (int j = 0; j < n; j++){
            if (matrix[0][j] == 0){
                isFirstRowZero = true;
                break;
            }
        }
        
        
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                // use first row and first column as mark
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < m; i++){
            if (matrix[i][0] == 0){
                for (int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
                        
        for (int j = 1; j < n; j++){
            if (matrix[0][j] == 0){
                for (int i = 0;  i< m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        // finally, check whether to set first row or column as zeros
        if (isFirstRowZero){
            for (int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
        
        if (isFirstColZero){
            for (int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}