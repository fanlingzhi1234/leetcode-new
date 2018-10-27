package Array;
/**
 * 905. Sort Array By Parity
 * @author Reuxs
 *
 *Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
 */

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] sortArrayByParity(int[] A) {
        for(int i=0, j=0; j<A.length; j++) {
        	if(A[j] %2 ==0) {
        		int temp = A[i];
        		A[i++] = A[j];
        		A[j] = temp;
        	}
        }
        return A;
        
    }

}
