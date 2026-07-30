class Solution {
    public int maxProfit(int[] prices) {
        // initial solution - works but is slower
        // int b = 0, currentProfit = 0, maxProfit = 0;
        // for (int s = 0; s < prices.length; s++) {
        //     currentProfit = prices[s] - prices[b];
        //     while (currentProfit < 0) {
        //         b++;
        //         currentProfit = prices[s] - prices[b];
        //     }
        //     maxProfit = Math.max(maxProfit, prices[s] - prices[b]);
        // }
        // return Math.max(maxProfit, 0);

        // b represents buying price, s represents selling price
        int b = 0, s = 1, max = 0;

        while (s < prices.length) {
            if (prices[b] < prices[s]) {
                int current = prices[s] - prices[b];
                max = Math.max(max, current);
            } else {
                b = s;
            }
            s++;
        }
        return max;
    }
}
