public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int low = prices[0];
        int rst = 0;
        for (int price : prices){
            if (price < low) low = price;
            else if (price - low > rst) rst = price - low;
        }
        return rst;
    }
}