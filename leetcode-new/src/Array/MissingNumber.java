package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
* @author Rexus 
* @version Build Time：Dec 7, 2018 10:37:10 AM
* @Explain
* 268. Missing number
* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,6,4,2,3,5,0,1};
		System.out.println(missingNumber2(nums));
	}
	//brute force 11ms, 11.71%
	public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1] != nums.length) return nums.length; // missing the last
        else if(nums[0] != 0) return 0; //missing the first
        
		for(int i=1; i<nums.length;i++) {
			int expectedNum = nums[i-1] +1;
        	if(nums[i] != expectedNum)
        		return expectedNum;
        }
		return -1;
    }
	// bit manipulation, 1ms, 65%
	public static int missingNumber2(int[] nums) {
		int missing = nums.length;
		for(int i=0; i< nums.length;i++) {
			missing ^= i ^ nums[i];
		}
		return missing;
	}
	// double elements and minus existing sum, divide 2; 1ms, 65%
	public static int missingNumber3(int[] nums) {
        int count = (nums.length + 1) * nums.length / 2;
        for (int num : nums) count -= num;
        return count;
    }
}
