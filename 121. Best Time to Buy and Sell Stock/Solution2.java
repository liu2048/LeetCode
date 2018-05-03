class Solution {
    public int maxProfit(int[] prices) {  
        int len = prices.length;
        if (len < 2) return 0; 
        int[] min = new int[len];
        int[] max = new int[len];        
        int curMin = prices[0];
        int curMax = prices[len-1];        
        int rst = 0;        
        for (int i = 0; i < len; i++) {
            int cur = prices[i];
            if (cur < curMin) {
                curMin = cur;
            }
            min[i] = curMin;
        }
        for (int i = len-1; i >= 0; i--) {
            int cur = prices[i];
            if (cur > curMax) {
                curMax = cur;
            }
            max[i] = curMax;
        }
        for (int i = len-1; i >= 0; i--) {
            int cur = max[i] - min[i];
            if (cur > rst) {
                rst = cur;
            }
        }
        return rst;
    }
}
