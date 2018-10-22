package BinarySearch;



//852. Peak Index in a Mountain Array
/**Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1
Example 2:

Input: [0,2,1,0]
Output: 1
Note:

3 <= A.length <= 10000
0 <= A[i] <= 10^6
A is a mountain, as defined above.
*/

public class peakIndexInAMountainArray {
	
	public static void main(String[] args) {
		int[] A = {3,5,33,28,17,9,8,4,2};
		int index = peakIndexInMountainArray(A);
		System.out.print(index);
	}
	
	static int peakIndexInMountainArray(int[] A) {
        return peakIndexInMountainArray(A, 0, A.length-1, -1);
    }
	static int peakIndexInMountainArray(int[] arr, int low, int high, int k) {
		int index = 0;
		int mid = (low+high)/2;
		
		if(arr[mid] > arr[mid-1] && arr[mid]> arr[mid+1]){
			index = mid;
		}
		if(arr[mid]>0 && arr[mid]<arr[mid-1]) {
			return peakIndexInMountainArray(arr, low, mid-1, -1);
		}
		if(arr[mid]>0 && arr[mid]<arr[mid+1]) {
			return peakIndexInMountainArray(arr, mid+1, high, -1);
		}
	return index;
	}
}