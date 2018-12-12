package Array;
/**
* @author Rexus 
* @version Build Time：Nov 15, 2018 2:56:52 PM
* @Explain
* 189. Rotate Array
* Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/
public class RotateArray {
	public int[] a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(a, k);
		System.out.println(a);
	}
	//103ms, 16%
	public static void rotate(int[] nums, int k) {
        int temp =0;
        int n = nums.length;
        while(k>0) {
        	temp = nums[n-1];
        	for(int i = n-1 ; i>0; i--) {
        		nums[i] = nums[i-1];
        	}
        	nums[0] = temp;

        	k--;
        }
    }
	//0ms, 100%
	public void rotate2(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}
}
