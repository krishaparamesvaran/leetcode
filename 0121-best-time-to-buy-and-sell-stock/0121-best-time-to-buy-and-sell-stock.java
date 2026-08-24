class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; 
        int maxProfit = 0;
        
        // Loop through the prices starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // 1. If today's price is lower than our minimum, update it!
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. Otherwise, check if selling today gives us a bigger profit
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        
        return maxProfit;
    }
        
    }
