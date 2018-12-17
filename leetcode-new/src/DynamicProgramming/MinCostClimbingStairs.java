package DynamicProgramming;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.concurrent.CountDownLatch;

/**
* @author Rexus 
* @version Build Time：Dec 12, 2018 7:11:28 PM
* @Explain
* 746. Min Cost Climbing Stairs
* On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
Note:
cost will have a length in the range [2, 1000].
Every cost[i] will be an integer in the range [0, 999].
*/
public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,15,20};
		System.out.println(minCostClimbingStairs(a));

	}
	
	public static int minCostClimbingStairs(int[] cost) {
		
        int n=cost.length;
        int[] result = new int[n];
        //System.out.println(cost[n]);
        cost[n] = 0;
        
        for(int i =2; i< cost.length; i++) {
        	result[i] = Math.min(result[i-1]+cost[i], result[i-2] + cost[i]);
        }
         
		return result[n];
    }

}
