class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            int currentProfit = prices[i] - min;

            if (currentProfit > profit) {
                profit = currentProfit;
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return profit;
    }
}