package Array;

/**
* @author Rexus 
* @version Build Time：Nov 10, 2018 12:33:06 AM
* @Explain
* 238. Product of array except self
* Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)


*/
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		a=productExceptSelf(a);
		System.out.println(a);
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        
        for(int i = 1; i<n ; i++) {
        	res[i] = res[i-1] * nums[i-1];
        }
        int right=1;
        for(int i= n-1; i>=0; i--) {
        	res[i] *= right;
        	right *= nums[i];
        }
        return res;
        
    }

}
