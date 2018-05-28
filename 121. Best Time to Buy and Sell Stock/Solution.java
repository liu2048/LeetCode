class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int globalMaxDiff = 0;
        int localMinPrice = prices[0];
        for (int price : prices) {
            int diff = price - localMinPrice;
            if (diff < 0) {
                localMinPrice = price;
            } else if (diff > globalMaxDiff) {
                globalMaxDiff = diff;
            }
        }
        return globalMaxDiff;
    }
}
