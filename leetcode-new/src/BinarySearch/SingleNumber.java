package BinarySearch;
/**
 * 136. Single Number
 * @author Reuxs
 *
 *
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		
		int[] nums = {4,1,2,1,2};
		int a =singleNumber(nums);
		
		System.out.println(a);
	}
	static int singleNumber(int[] nums) {
		int result = 0;
        
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        
        return result;
        
    }
}
