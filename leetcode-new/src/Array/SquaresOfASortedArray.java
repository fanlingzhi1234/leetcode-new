package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SortedMap;

/**
* @author Rexus 
* @version Build Time：Jan 25, 2019 6:11:17 PM
* @Explain
* 977. Squares of a Sorted Array

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
 also in sorted non-decreasing order.

 

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.
*/
public class SquaresOfASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-7,-3,2,3,11};
		int[] result = sortedSquares2(a);
		for(int i =0; i<a.length;i++) {
			System.out.println(result[i]);
		}

	}
	
	public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++) {
        	result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
		return result;
    }
	//Without sort, utilize math.abs to judge whether the starter or the ender is greater.
	//7ms, 100%
	public static int[] sortedSquares2(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }

}
