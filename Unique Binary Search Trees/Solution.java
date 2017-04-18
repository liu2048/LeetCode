public class Solution { // Catalan number
    public int numTrees(int n) {
        if (n <= 0) return 0;
        int[] rst = new int[n + 1];
        rst[0] = 1;
        rst[1] = 1;
        for (int i = 2; i <= n; i++){
            for (int j = 0; j < i; j++){
                rst[i] += rst[j] * rst[i-j-1];
            }
        }
        return rst[n];
    }
}