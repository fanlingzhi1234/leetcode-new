package DynamicProgramming;

import static org.hamcrest.CoreMatchers.not;

import Array.LengthOfLastWord;

/**
* @author Rexus 
* @version Build Time：Dec 12, 2018 7:14:47 PM
* @Explain
* 70. Climbing Stairs
* You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println(climbStairs(n));

	}
	//1ms 100%
	public static int climbStairs(int n) {
        if(n <=1 ) return 1;
        
        int[] count = new int[n];
        count[0] = 1;
        count[1] = 2;
        for(int i = 2; i < n; i++) {
        	count[i] = count[i-1] + count[i-2];
        }
        return count[n-1];
    }

}
