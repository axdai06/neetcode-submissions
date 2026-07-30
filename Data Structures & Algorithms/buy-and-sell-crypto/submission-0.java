class Solution {
    public int maxProfit(int[] prices) {
        int b = 0;
        int currentProfit = 0;
        int maxProfit = 0;
        for (int s = 0; s < prices.length; s++) {
            currentProfit = prices[s] - prices[b];
            while (currentProfit < 0) {
                b++;
                currentProfit = prices[s] - prices[b];
            }
            maxProfit = Math.max(maxProfit, prices[s] - prices[b]);
        }
        return Math.max(maxProfit, 0);
    }
}
