package Array;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
* @author Rexus 
* @version Build Time：Dec 7, 2018 11:33:19 AM
* @Explain
* 217. COntains Duplicate
* 
* Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3};
		System.out.println(containsDuplicate(nums));
	}
	//28ms 8.8%
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> res = new HashSet<>(nums.length);
		for(int i : nums) {
			if(res.contains(i)) return true;
			res.add(i);
		}
		return false;
    }
	//5ms, 96%
	public static boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0; i< nums.length-1; i++) {
			if(nums[i] == nums[i+1]) return true;
		}
		return false;
	}

}
