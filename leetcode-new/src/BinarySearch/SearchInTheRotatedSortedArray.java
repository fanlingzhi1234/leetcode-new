package BinarySearch;
/**
 * 33. Search in Rotated Sorted Array
 * @author Reuxs
 *
 *
 *
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1


 */
public class SearchInTheRotatedSortedArray {

	
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		
		int target = 1;
		int a = search(nums, target);
		
		System.out.println(a);
	}
	
	static int MinRotated(int[] arr) {

    	int low =0;
    	int high = arr.length -1;
    	while(arr[low] > arr[high]) {
    		int mid = (low+high) /2;
    		if(arr[mid] > arr[high])
    			low = mid+1;
    		else
    			high= mid;
    	}
    	return low;
	}
	
	static int search(int[] arr, int target) {
		return search(arr, 0, arr.length-1,target);
	}
	
	static int search(int[] arr, int low, int high, int x) {
		
			
			if(low > high)
                return -1;
            int mid = (low + high)/2;
            if(arr[mid] == x)
                return mid;
            
            if(arr[low] <= arr[mid]){
                // First part is properly sorted
                if(x >= arr[low] && x <= arr[mid]){
                    // value to be searched is inside low and mid
                    return search(arr, low, mid-1, x);
                }
                return search(arr, mid+1, high, x);

            }

            if(x >= arr[mid] && x <= arr[high])
                return search(arr, mid +1, high, x);
            
            return search(arr, low, mid-1, x);
    }
}

