package Array;
/**
* @author Rexus 
* @version Build Time：Nov 10, 2018 11:23:53 PM
* @Explain
* 53. Maximum Subarray
* 

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

*/
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray2(nums));
	}
	
	//16ms 13%
	public static int maxSubArray(int[] nums) {
		int n = nums.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
	
	//6ms 100% Kadanm;
	public static int maxSubArray2(int[] A) {
	    int maxSoFar=A[0], maxEndingHere=A[0];
	    for (int i=1;i<A.length;++i){
	    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
	    }
	    return maxSoFar;
	}

}
