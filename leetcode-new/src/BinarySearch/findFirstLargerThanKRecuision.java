package BinarySearch;

class FindFirstLargerThanKRecuision
{
	
	public static void main(String[] args)
    {
        int[] A = { 1, 3, 4, 5, 6, 8, 10};
        int k =7;
        int index = FindFirstLargerThanK(A,k);
        System.out.println(A[index]);
    }
	
    static int FindFirstLargerThanK(int[] arr, int k){
        return FindFirstLargerThanK(arr, 0, arr.length-1, k);

    }
    static int FindFirstLargerThanK(int[] arr, int low, int high, int k)
    {
        int mid = (low + high)/2;

        while(low <= high){
            if(arr[mid] == k){
                return mid;

            }else if(arr[mid]<k){

                return FindFirstLargerThanK(arr,mid+1,high,k );
            }
            else{
                return FindFirstLargerThanK(arr,low, mid-1,k );
            }
        }
        return -999;

    }
    
}

