package BinarySearch;
/**
 * 162. Find Peak Element
 * @author Reuxs
 *
 *
 *
 *
A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.
Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5 
Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.

找peak ，任意peak皆可。

从左遍历，for循环
三个int加一个index
左，中，右，右可以用中+1实现
或者是从中间往两边找。


 */
public class FindPeakElement {
	
	public static void main(String[] args) {
		int[] num = {1,4,2,3,5,9,11};
		int index = findPeakElement(num);
		System.out.print(index);
		
	}
	
	
		
		static int findPeakElement(int[] nums) {
	        int index=0;
	        int top=0;
	        int lastValue=0;
	        
	        for(int i=0; i<nums.length;i++){
	            if(lastValue < nums[i] && top < nums[i]){
	                top=nums[i];
	                index=i;
	            }
	            lastValue = nums[i];
	        }
	        return index;
	    }
		
		static int findPeakElementWITHLINEARSCAN(int[] nums) {
	        
	        
	        for(int i=0; i<nums.length-1;i++){
	            if(nums[i]>nums[i+1]){
	                return i;
	            }
	        
	        }
	        return nums.length-1;
	    }
}
	

