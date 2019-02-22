package Array;



/**
* @author Rexus 
* @version Build Time：Nov 9, 2018 11:10:38 PM
* @Explain
* 283.Move Zeroes
* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

*/
public class MoveZeroes {
	
	public int[] a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,0,4,0,5,13,9,0};
		moveZeroes(a);
		System.out.println(a);
	}
	public static void moveZeroes(int[] nums) {
		 int j = 0;
		    for(int i = 0; i < nums.length; i++) {
		        if(nums[i] != 0) {
		            int temp = nums[j];
		            nums[j] = nums[i];
		            nums[i] = temp;
		            j++;
		        }
		    }
	}
	public static void moveZeroes2(int[] nums) {
		if(nums.length == 0 || nums == null) return;
        
		int insertPos=0;
		for(int num : nums) {
			if(num != 0) 
				nums[insertPos++] = num;
		}
		
		while(insertPos<nums.length) {
			nums[insertPos] = 0;
			insertPos++;
		}
    }
	
	

}
