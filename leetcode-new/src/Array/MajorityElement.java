package Array;

import java.util.HashMap;

/**
* @author Rexus 
* @version Build Time：Nov 10, 2018 6:05:55 PM
* @Explain
* 169. Majority Element
* 
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,2,1,1,1,2};
		System.out.println(majorityElement(a));
	}
	
	public static int majorityElement(int[] nums) {
		//HashMap<Integer, Integer> map = new HashMap<>();
		
		int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;
            
        }
        return major;
    }

}
