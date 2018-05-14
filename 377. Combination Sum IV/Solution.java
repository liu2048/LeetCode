class Solution {
    public int combinationSum4(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return 0;    
        int[] dp = new int[target+1];
        dp[0] = 1;        
        for (int i = 1; i <= target; i++) {
            for (int n : nums) {
                if (i >= n) {
                    dp[i] += dp[i - n];
                }
            }
        }
        return dp[target];
    }
}
