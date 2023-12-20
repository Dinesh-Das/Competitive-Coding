class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int debt=prices[0]+prices[1];
        if(money-debt < 0) return money;
        return money-debt;   
    }
}