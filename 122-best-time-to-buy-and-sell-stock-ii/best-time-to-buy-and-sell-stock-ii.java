class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=0,j=1;j<prices.length;i++,j++)
            if(prices[i] < prices[j] )
                maxProfit+=prices[j]-prices[i];
        return maxProfit;
    }
}

