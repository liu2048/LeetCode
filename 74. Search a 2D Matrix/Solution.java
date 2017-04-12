public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        if (target < matrix[0][0] || target > matrix[m-1][n-1]) return false;
        int left = 0;
        int right = m - 1;
		
		// first binary search, locate the row
        while (left <= right){
            int mid = (left + right) / 2;
            if (matrix[mid][0] == target) return true;
            else if (matrix[mid][0] < target) left = mid + 1;
            else right = mid - 1;
        }
        
        int row = right;
        left = 0;
        right = n - 1;
		
		// second binary search, locate the column
        while (left <= right){
            int mid = (left + right) / 2;
            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}