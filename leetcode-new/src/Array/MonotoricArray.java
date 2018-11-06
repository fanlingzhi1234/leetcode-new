package Array;

/**
 * 896. Monotoric Array
 * @author Reuxs
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

 

Example 1:

Input: [1,2,2,3]
Output: true
Example 2:

Input: [6,5,4,4]
Output: true
Example 3:

Input: [1,3,2]
Output: false
Example 4:

Input: [1,2,4,5]
Output: true
Example 5:

Input: [1,1,1]
Output: true
 

Note:

1 <= A.length <= 50000
-100000 <= A[i] <= 100000
 */
public class MonotoricArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		System.out.println(isMonotonic(nums));

	}
	//20ms, 38%
	public static boolean isMonotonic(int[] A) {
        if(isMonotonicIncreasing(A) || isMonotonicDecreasing(A))
        	return true;
		return false;
    }
	public static boolean isMonotonicIncreasing(int[] A) {
		for(int i=0; i<A.length-1;i++) {
			if(A[i+1]<A[i])
				return false;
		}
		return true;
	}
	
	public static boolean isMonotonicDecreasing(int[] A) {
		for(int i=0; i<A.length-1;i++) {
			if(A[i+1]>A[i])
				return false;
		}
		return true;
	}
	//15ms, 90%
	//
	public boolean isMonotonic2(int[] A) {
        if (A.length==1) return true;
        int n=A.length;
        boolean up= (A[n-1]-A[0])>0; // judge inc or dec;
        for (int i=0; i<n-1; i++)
            if (A[i+1]!=A[i] && (A[i+1]-A[i]>0)!=up) // if A[i+1] and A[i] don't match the trend; 
                return false;
        return true;
    }
}
