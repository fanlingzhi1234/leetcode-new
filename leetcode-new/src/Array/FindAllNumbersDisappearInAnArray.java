package Array;

import java.util.ArrayList;
import java.util.List;

/**
* @author Rexus 
* @version Build Time：Nov 10, 2018 3:41:13 AM
* @Explain
* 448. Find All Numbers Disappeared in an Array
* 

Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]

*/
public class FindAllNumbersDisappearInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		List<Integer> res = new ArrayList<>();
		int[] A = new int[n];
		for(int a : A) {
			a=0;
		}
		for(int i = 0; i < n; i++) {
			A[nums[i]-1] ++;
		}
		for(int i =0;i<n;i++) {
			if(A[i] == 0) {
				res.add(i+1);
			}
		}
		
		return res;
        
    }

}
