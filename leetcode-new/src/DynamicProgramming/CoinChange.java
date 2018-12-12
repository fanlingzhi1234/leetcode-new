package DynamicProgramming;


/**
* @author Rexus 
* @version Build Time：Nov 27, 2018 12:28:51 AM
* @Explain
* 322. Coin Change
* You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3 
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
*/
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2};
		int amount = 3;
		System.out.println(coinChange(coins, amount));
	}
	
	public static int coinChange(int[] coins, int amount) {
        int count=0;
        int[][] table = new int[coins.length+1][amount +1];
        
        int row = table.length;
        int col = table[0].length;
        
        for(int i =0; i< row; i++) {
        	for (int j= 0; j< col; j++) {
        		if(j == 0) 
        			table[i][j] =0;
        		else
        			table[i][j] = Integer.MAX_VALUE;
        	}
        }
        
        for(int i = 1; i< row; i++) {
        	for(int j = 1; j< col; j++) {
        		if(coins[i -1] > j){
                    // copy top value
                    table[i][j] = table[i-1][j];
                }else{
                    if( table[i-1][j] == Integer.MAX_VALUE && table[i][j - coins[i-1]] == Integer.MAX_VALUE)
                        table[i][j] = Integer.MAX_VALUE;
                    else if (table[i][j - coins[i-1]] == Integer.MAX_VALUE) // previous value could not be calculated
                        table[i][j] = table[i-1][j];
                    else
                        table[i][j] = Math.min(table[i-1][j],  table[i][j - coins[i-1]] +1);
                }
        	}
        }
        
        return table[row-1][col-1];
    }
	//22ms, 67%
	public int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
        	dp[i] = Integer.MAX_VALUE;
        	for(int c : coins){
        		if( i - c >= 0 && dp[i - c] != Integer.MAX_VALUE)
        			dp[i] = Math.min(dp[i], dp[i - c] + 1);
        	}
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

}
