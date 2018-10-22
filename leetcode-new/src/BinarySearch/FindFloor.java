package BinarySearch;



import java.io.*;

class FindFloor {

    public static void main(String[] args)
    {
        int arr[] = {2, 3, 4, 9, 15, 17, 19};
        int x = 11;
        int index = floorSearch(arr, 0, arr.length - 1, x);
        if (index == -1)
            System.out.println("No floor");
        else
            System.out.println(arr[index]);
    }
    static int floorSearch(int arr[], int low, int high, int x)
    {
        int mid = (low+high)/2;
        if (low > high)
            return -1;
        if (x >= arr[high])
            return high;
        if (arr[mid] == x)
            return mid;
        if (mid > 0 && arr[mid-1] <= x && x < arr[mid])
            return mid-1;
        if (x < arr[mid])
            return floorSearch(arr, low, mid - 1, x);

        return floorSearch(arr, mid + 1, high, x);
    }

}
