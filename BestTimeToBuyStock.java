class Solution {
    public int maxProfit(int[] prices) {

        // if(prices.length == 1) return 0;
        // int max_profit = Integer.MIN_VALUE;

        // for(int i=0;i<prices.length;i++){
        // for(int j=i+1;j<prices.length;j++){
        // if(prices[i] < prices[j]){
        // max_profit = Math.max(max_profit,prices[j]-prices[i]);
        // }
        // }
        // }

        // return max_profit == Integer.MIN_VALUE ? 0 : max_profit;

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i])
                min = prices[i];
            else {
                max = Math.max(max, prices[i] - min);
            }
        }

        return max;

    }
}