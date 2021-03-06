package Array;

import java.util.List;
import java.util.ArrayList;

/**
 * 54.Sprial Matrix;
 * @author Reuxs
 *Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));


	}
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(true){
            for(int i = left; i <= right; i++) {
            	res.add(matrix[top][i]);
            }
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++) {
            	res.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) {
            	res.add(matrix[bottom][i]);
            }
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) {
            	res.add(matrix[i][left]);
            }
            left++;
            if(left > right || top > bottom) break;
        }
        
        return res;
    }

}
