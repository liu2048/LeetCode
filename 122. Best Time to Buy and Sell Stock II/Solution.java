class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int rst = 0;
        for (int i = 1; i < len; i++){
            int diff = prices[i] - prices[i-1];
            if (diff > 0){
                rst += diff;
            }
        }
        return rst;
    }
}
