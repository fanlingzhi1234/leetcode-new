package Array;

import static org.hamcrest.CoreMatchers.instanceOf;

import javax.xml.transform.Templates;

/**
 * 485. Max Consecutive Ones
 * @author Reuxs
 *
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	//5ms, 82.2%
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0; 
		int res = 0;
		
		for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
            	count++;
            	res = Math.max(count, res);
            }
            else 
            	count = 0;
        }
		return res;
	}
	//11ms, 5.8%
	public static int findMaxConsecutiveOnes2(int[] nums) {
		int count = 0; 
		int res = 0;
		for(int n : nums) {
			count = n == 0? 0 : count +1;
			res = Math.max(res, count);
		}
        
		return res;
    }

}
