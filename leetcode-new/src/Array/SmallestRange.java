package Array;

import java.util.Arrays;


/**
 *908. Smallest Range I
 * @author Reuxs

Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the minimum value of B.

   

Example 1:

Input: A = [1], K = 0
Output: 0
Explanation: B = [1]
Example 2:

Input: A = [0,10], K = 2
Output: 6
Explanation: B = [2,8]
Example 3:

Input: A = [1,3,6], K = 3
Output: 0
Explanation: B = [3,3,3] or B = [4,4,4]


910. Smallest Range II
Given an array A of integers, for each integer A[i] we need to choose either x = -K or x = K, and add x to A[i] (only once).

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the minimum value of B.

 

Example 1:

Input: A = [1], K = 0
Output: 0
Explanation: B = [1]
Example 2:

Input: A = [0,10], K = 2
Output: 6
Explanation: B = [2,8]
Example 3:

Input: A = [1,3,6], K = 3
Output: 3
Explanation: B = [4,6,3]
 

Note:

1 <= A.length <= 10000
0 <= A[i] <= 10000
0 <= K <= 10000
 */
public class SmallestRange {
	/*public static void main(String args[]) {
		int[] A = {1,3,6};
		int k = 3;
		int[] B = {0,10};
		int k2 = 2;
		int[] C = {2,7,2};
		int k3 = 1;
		int[] D = {3,1,10};
		int k4 = 4;
		int[] E = {9,10,0,7};
		int k5 =1;
		int result = smallestRange22(D,k4);
		System.out.println(result);
		
	}*/
	
	static int smallestRange1(int[] A, int K) {
        int low =0;
        int high =0;
        Arrays.sort(A);
        int smallest = A[0]-K;
        int largest = A[0]+K;
        int result = 0;
        
        
        if(A.length == 1) return 0;
        for(int i=0;i<A.length;i++) {
        	low = A[i] - K;
        	high = A[i] + K;
        	if(low > largest) {
        		smallest = largest;
        		largest = low;
        		result = largest - smallest;
        	}
        	else if(high < smallest) {
        		largest = smallest;
        		smallest = high;
        		result = largest - smallest;
        	}
        	else if(low < largest || high > smallest)
        		result = 0;
        	
        }
        return result;
		
    }
	public int smallestRangeI(int[] A, int K) {
	       if(A.length<2)   
	            return 0;
	        Arrays.sort(A);
	        if(A[A.length-1]-K<=A[0]+K)
	            return 0;
	        return A[A.length-1]-A[0]-2*K;
	    }
	
	static int smallestRange2(int[] A, int K) {
        Arrays.sort(A);
        int[] B = new int[A.length];
        int max=A[0];
        int min =0;
        if(A.length == 1) return 0;
        for(int i = 0; i< A.length-1;i++) {
        	if(A[i+1]>A[i]) {
        		B[i] = A[i]+K;
        	}
        	else 
        		B[i] = A[i]-K;
        }
        
        for(int i=0;i<B.length;i++) {
        	if(B[i]>max)
			{
				max=B[i];
			}
			if(B[i]<min)
			{
				min=B[i];
			}
		

        }
        int result = max - min;
		return result;
	}
	
	public static int smallestRange22(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length, mx = A[n - 1], mn = A[0], res = mx - mn;
        for (int i = 0; i < n - 1; ++i) {
            mx = Math.max(mx, A[i] + 2 * K);
            mn = Math.min(A[i + 1], A[0] + 2 * K);
            res = Math.min(res, mx - mn);
        }
        return res;
    }
	
}
