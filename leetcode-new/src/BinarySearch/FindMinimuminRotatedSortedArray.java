package BinarySearch;
/**
 * 153. Find Minimum in Rotated Sorted Array
 * @author Reuxs
 *
 *
Suppose an array sorted in ascending order is rotated at 
some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

Example 1:

Input: [3,4,5,1,2] 
Output: 1
Example 2:

Input: [4,5,6,7,0,1,2]
Output: 0

 */
public class FindMinimuminRotatedSortedArray {
	public static void main(String args[]) {
		int[] nums = {3,4,5,1,2};
		int a = findMin(nums);
		System.out.println(a);
	}
	
	static int findMin(int[] nums) {
        int low=0, high = nums.length-1;
        
        if(nums==null) return -1;
        if(nums.length==1) return nums[0];
        if(nums[high] >nums[0]) return nums[0];
        
        while(high>=low) {
        	int mid = (low+high)/2;
        	if(nums[mid]>nums[mid+1])
        		return nums[mid+1];
        	if(nums[mid-1]>nums[mid])
        		return nums[mid];
        	
        	if( nums[mid]> nums[0]) 
        		low=mid+1;
        	else 
				high= mid-1;
			
        	}
        
        return -1;
    }
}

