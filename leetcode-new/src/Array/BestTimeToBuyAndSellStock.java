package Array;
/**
* @author Rexus 
* @version Build Time：Nov 10, 2018 9:48:15 PM
* @Explain
* 
* 121. Best Time to Buy and Sell Stock
* 
* Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

*/
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,1,5,3,6,4};
		System.out.println(maxProfit2(a));
	}
	//362ms, 6%
	public static int maxProfit(int[] prices) {
        int res=0;
        int diff=0;
        for(int i = 0; i < prices.length; i++) {
        	for(int j = i; j < prices.length; j++) {
        		if(prices[i] < prices[j]) {
        			diff = Math.abs(prices[i] - prices[j]);
        			res = Math.max(diff, res);
        		}
        	}
        }
		return res;
    }
	
	//1ms, 100%
	public static int maxProfit2(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
