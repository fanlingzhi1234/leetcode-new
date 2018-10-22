package BinarySearch;

public class firstLargerThanKRecuision {
	public static void main(String[] args)
    {
		int result=0;
        int[] A = { 1, 3, 4, 5, 6, 8, 10};
        int k =7;
        if(A[0]>k) {
        	result= A[0];
        }
        if( A[A.length-1]<k) {
        	result= A[A.length-1];
        }
        result = FindFirstLargerThanK(A,k);
        System.out.println(result);
    }
	
    static int FindFirstLargerThanK(int[] arr, int k){
        return FindFirstLargerThanK(arr, 0, arr.length-1, k);

    }
    static int FindFirstLargerThanK(int[] arr, int low, int high, int k)
    {
        int mid = (low + high)/2;
        
        while(low <= high){
        	if(arr[mid]==k) {
        		return arr[mid+1];
        	}
            if(arr[mid] < k){
            	return FindFirstLargerThanK(arr,mid+1,high,k );
            }else {
            	return FindFirstLargerThanK(arr,low, mid-1,k );
                
            }
        }
        return arr[mid+1];

    }
}
