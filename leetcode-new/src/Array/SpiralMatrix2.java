package Array;
/**
 * 59.Spiral Matrix 2
 * @author Reuxs
 *
Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
public class SpiralMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[][] nums = generateMatrix(n);
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[0].length;j++) {
				System.out.println(nums[i][j]);
			}
		}

	}
	public static int[][] generateMatrix(int n) {
        if(n == 0) return null;
        int[][] res= new int[n][n];
        
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int count=1;
        while(true){
            for(int i = left; i <= right; i++) {
            	
            	res[top][i] = count;
            	count++;
            }
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++) {
            	
            	res[i][right] = count;
            	count ++;
            }
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) {
            	
            	res[bottom][i] = count;
            	count++;
            }
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) {
            	
            	res[i][left] = count;
            	count ++;
            }
            left++;
            if(left > right || top > bottom) break;
        }
        return res;
    }
}
