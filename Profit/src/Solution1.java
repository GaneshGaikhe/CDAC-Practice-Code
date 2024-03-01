public class Solution1 {
    public int maxProfit(int[] prices)
     {
        if (prices == null || prices.length <= 1) 
        {
            return 0; // If there are no prices or only one price, you cannot make a profit.
        }

        int minPrice = prices[0]; // Initialize the minimum price as the first price.
        int maxProfit = 0; // Initialize the maximum profit as 0.

        for (int i = 1; i < prices.length; i++)
         {
            // Check if the current price is smaller than the minimum price seen so far.
            // If yes, update the minimum price.
            if (prices[i] < minPrice)
             {
                minPrice = prices[i];
            }
             else 
            {
                // Calculate the profit if you sell at the current price.
                int currentProfit = prices[i] - minPrice;
                // Update the maximum profit if the current profit is greater.
                if (currentProfit > maxProfit) 
                {
                    maxProfit = currentProfit;
                }
            }
          }

        return maxProfit;
    }
}
