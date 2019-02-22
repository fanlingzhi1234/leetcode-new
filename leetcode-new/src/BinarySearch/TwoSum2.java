package BinarySearch;


/**
 * 167. Two Sum II - Input array is sorted
 * @author Reuxs
 *
 *
 *
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.


 */
public class TwoSum2 {
	public static void main(String[] args) {
		int[] index = new int[2];
		int[] nums = {2,7,11,15};
		index = twoSum2(nums, 9);
		System.out.println(index[0] +","+ index[1]);
	}
	/*
	static int[] twoSum(int[] numbers, int target) {
		int[] index = new int[2];
		for(int i=0; i< numbers.length;i++) {
			for(int j=1; j<numbers.length;j++) {
				if(numbers[i]+numbers[j] == target)  {
					return index;
				}
			}
		}
		return index;
	}
	*/
	
	static int[] twoSum2(int[] numbers, int target) {
		int[] index = new int[2];
		int low = 0;
		int high = numbers.length-1;
		
		if(numbers  == null || numbers.length < 2) return index;
		while(low<high) {
			int a=numbers[low]+numbers[high];
			if(a == target) {
				index[0]= low+1;
				index[1] = high+1;
				break;
			}
			else if(a < target) {
				low++;
			}
			else if(a> target) {
				high--;
			}
		}
		
		
		return index;
	}
	
	/*
	 int[] indice = new int[2];
    if (num == null || num.length < 2) return indice;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int v = num[left] + num[right];
        if (v == target) {
            indice[0] = left + 1;
            indice[1] = right + 1;
            break;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
    return indice;
	*/
}


