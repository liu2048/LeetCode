public class Solution {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int rst = 0;
        int a = 1, b = 2;
        for (int i = 2; i < n; i++){
            rst = a + b;
            a = b;
            b = rst;
        }
        return rst;
    }
}