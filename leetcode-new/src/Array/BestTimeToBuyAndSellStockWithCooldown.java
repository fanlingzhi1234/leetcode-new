package Array;
/**
* @author Rexus 
* @version Build Time：Nov 11, 2018 3:12:48 AM
* @Explain
* 
* 309. Best Time to Buy and Sell Stock with Cooldown
* 
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
Example:

Input: [1,2,3,0,2]
Output: 3 
Explanation: transactions = [buy, sell, cooldown, buy, sell]
*/
public class BestTimeToBuyAndSellStockWithCooldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,3,1,4,9,4,5,3};
		System.out.println(maxProfit2(a));
	}
	
	public static int maxProfit(int[] prices) {
		int res = 0;
		if(prices.length < 2) return 0;
        
        for(int i =0; i<prices.length-2; i++) {
        	if(prices[i+1] > prices[i])
        		res = i+2;
        }
        return res;
    }
	
	public static int maxProfit2(int[] prices) {
	    int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
	    for (int price : prices) {
	        prev_buy = buy;
	        buy = Math.max(prev_sell - price, prev_buy);
	        prev_sell = sell;
	        sell = Math.max(prev_buy + price, prev_sell);
	    }
	    return sell;
	}

}
