package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 566.Reshape the Matrix
 * @author Reuxs
 *
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
Note:
The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.
 */
public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 1, c=4;
		int[][] nums = {{1,2} ,{3,4}};
		nums = matrixReshape(nums, r, c);
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[0].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
	}
	
	//10ms, 7.7%
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c != nums.length* nums[0].length) return nums;
        List<Integer> aIntegers = new ArrayList<>();
        int[][] res = new int[r][c];
        for(int i=0;i<nums.length;i++) {
        	for(int j=0; j<nums[0].length;j++) {
        		aIntegers.add(nums[i][j]);
        	}
        }
        int count = 0;
        for(int i = 0; i < r; i++) {
        	for( int j =0; j<c; j++) {
        		res[i][j] = aIntegers.get(count);
        		count ++;
        	}
        }
        
		
		return res;
    }
	//6ms,51%
	public int[][] matrixReshape2(int[][] nums, int r, int c) {
	    int n = nums.length, m = nums[0].length;
	    if (r*c != n*m) return nums;
	    int[][] res = new int[r][c];
	    for (int i=0;i<r*c;i++) 
	        res[i/c][i%c] = nums[i/m][i%m];
	    return res;
	}
	
	//4ms, 100%
	public int[][] matrixReshape3(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if(nums.length == 0 || nums.length * nums[0].length != r * c) return nums;
        int i = 0;
        for(int[] row: nums){
          for(int n: row){
            res[i / c][i % c] = n;
            i++;
          }
        }
        return res;
    }

}
