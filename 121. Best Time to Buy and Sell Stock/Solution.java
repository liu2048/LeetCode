class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;        
        if (len < 2) return 0;                
        int global = 0;
        int low = prices[0];
        for (int price : prices) {
            int diff = price - low;
            if (diff < 0) {
                low = price;
            } else if (diff > global) {
                global = price - low;                
            }            
        }
        return global;
    }
}
