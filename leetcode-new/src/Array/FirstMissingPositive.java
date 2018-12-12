package Array;

/**
* @author Rexus 
* @version Build Time：Nov 15, 2018 3:17:41 PM
* @Explain
* 41. First Missing Positive
* Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
Note:

Your algorithm should run in O(n) time and uses constant extra space.
*/
public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1};
		int[] b = {3,4,-1,1};
		int[] c = {7,8,9,11,12};
		System.out.println(firstMissingPositive(a));
		System.out.println(firstMissingPositive(b));
		System.out.println(firstMissingPositive(c));

	}
	
	public static int firstMissingPositive(int[] nums) {
       
        int length = nums.length;
        
        for(int i =0; i<length ; i++) {
        	int cur = nums[i];
        	while(cur > 0 && cur <= length && nums[cur-1] != cur) {
        		int next = nums[cur-1];
        		nums[cur - 1] = cur;
        		cur = next;	
        	}
        }
        for (int i = 0; i<length; i++) {
        	if(nums[i] != i+1) return i+1;
        }
        return length+1;
    }

}
