public class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0 || s.charAt(0) == '0') return 0;
        int[] dp = new int[len + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= len; i++){
            int x = Integer.parseInt(s.substring(i-1,i));
            int y = Integer.parseInt(s.substring(i-2,i));
            if (x != 0) dp[i] = dp[i-1];
            if (y >= 10 && y <= 26) dp[i] += dp[i-2];
        }
        return dp[len];
    }
}