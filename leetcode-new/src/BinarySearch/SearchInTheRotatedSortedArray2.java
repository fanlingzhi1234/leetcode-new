package BinarySearch;
/**
 * 81. Search in Rotated Sorted Array II
 * @author Reuxs
 *Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).

You are given a target value to search. If found in the array return true, otherwise return false.

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 */
public class SearchInTheRotatedSortedArray2 {
	
	public static void main(String[] args) {
		int[] nums = {1,3,1,1,1};
		
		int target = 3;
		
		boolean x  = search(nums, target);
		
		System.out.println(x);
	}
	
	static boolean search(int[] nums, int target) {
		
		return search(nums, 0, nums.length-1,target);
		
		
	}
	
	
	static boolean search(int[] nums, int low, int high, int x) {
		
			
			if(low > high)
                return false;
            int mid = (low + high)/2;
            if(nums[mid] == x)
                return true;
            
            if(nums[low] <= nums[mid]){
                // First part is properly sorted
                if(x >= nums[low] && x <= nums[mid]){
                    // value to be searched is inside low and mid
                    return search(nums, low, mid-1, x);
                }
                return search(nums, mid+1, high, x);

            }

            if(x >= nums[mid] && x <= nums[high])
                return search(nums, mid +1, high, x);
            
            return search(nums, low, mid-1, x);
        }
	
	public boolean search1(int[] nums, int target) {
	    int start  = 0, end = nums.length - 1;
	    
	    //check each num so we will check start == end
	    //We always get a sorted part and a half part
	    //we can check sorted part to decide where to go next
	    while(start <= end){
	        int mid = start + (end - start)/2;
	        if(nums[mid] == target) return true;
	        
	        //if left part is sorted
	        if(nums[start] < nums[mid]){
	            if(target < nums[start] || target > nums[mid]){
	                //target is in rotated part
	                start = mid + 1;
	            }else{
	                end = mid - 1;
	            }
	        }else if(nums[start] > nums[mid]){
	            //right part is rotated
	            
	            //target is in rotated part
	            if(target < nums[mid] || target > nums[end]){
	                end = mid -1;
	            }else{
	                start = mid + 1;
	            }
	        }else{
	            //duplicates, we know nums[mid] != target, so nums[start] != target
	            //based on current information, we can only move left pointer to skip one cell
	            //thus in the worest case, we would have target: 2, and array like 11111111, then
	            //the running time would be O(n)
	            start ++;
	        }
	    }
	    
	    return false;
	}



    public boolean search2(int[] nums, int target) {
        if(nums.length == 0) return false;
        int lo = 0, hi = nums.length - 1;
        while(lo < hi){
            while(hi > lo && nums[hi] == nums[hi-1]){
                hi--;
            }
            int mid = (lo + hi)>>>1;
            if(nums[mid] == target) return true;
            if(lo == hi) break;
            if(nums[lo] < nums[hi]){
                if(nums[mid] < target){
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if(nums[mid] >= nums[lo]){
                    if(target < nums[mid] && target >= nums[lo]){
                        hi = mid;                    
                    } else{
                        lo = mid + 1;
                    }
                } else{
                    if(target > nums[mid] && target <= nums[hi]){
                        lo = mid + 1;
                    } else{
                        hi = mid;
                    }
                }
            }
        }
        return nums[lo] == target;
    }
}