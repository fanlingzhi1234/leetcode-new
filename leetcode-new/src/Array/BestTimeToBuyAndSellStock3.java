package Array;
/**
* @author Rexus 
* @version Build Time：Nov 14, 2018 2:11:44 AM
* @Explain
* 
* 123. Best time to buy and sell stocks 3
* 
* Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
             Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/
public class BestTimeToBuyAndSellStock3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));

	}
	
	//2ms, 96%;	
	public static int maxProfit(int[] prices) {
		
		if(prices == null || prices.length == 0) return 0;
		int buyone = Integer.MIN_VALUE;
		int sellone = 0;
		int buytwo = Integer.MIN_VALUE;
		int selltwo = 0;
		
		for(int i : prices) {
			selltwo = Math.max(selltwo, buytwo+i);
			buytwo = Math.max(buytwo, sellone-i);
			sellone = Math.max(sellone, buyone+i);
			buyone = Math.max(buyone, -i);
		}
		
		return selltwo;
		
	}
	
	//With DP; 4ms 45%;
	public static int maxProfit2(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int totalK = 2;
        int[][] dp = new int[totalK+1][prices.length];
        for(int k = 1;k<=totalK;k++){//profit = 0 when k = 0
            int maxDiff = -prices[0];//dp[0][-1] - price[0]
            for(int i = 1;i< prices.length;i++){
                //if(i = 1) maxDiff = 0 - prices[0];
                if(i>1) maxDiff = Math.max(maxDiff,dp[k-1][i-2]-prices[i-1]);//maxDiff = dp[k-1][i-2] -  prices[i-1]
                dp[k][i] = Math.max(dp[k][i-1],maxDiff + prices[i]);//sell on day i OR not
            }
        }
        return dp[totalK][prices.length-1];
    }

}
