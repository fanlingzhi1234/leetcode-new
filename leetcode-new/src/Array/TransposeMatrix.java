package Array;

/**
 * 867. Transpose Matrix
 * @author Reuxs
 *Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

 

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 

Note:

1 <= A.length <= 1000
1 <= A[0].length <= 1000
 */
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6}};
		System.out.println(transpose(matrix));
	}
	
	public static int[][] transpose(int[][] A) {
		if(A.length == 0 || A[0].length == 0) return A;
        int row = A.length;
        int column = A[0].length;
        int[][] res = new int[column][row];
        for(int i = 0 ;i< row;i++) {
        	for(int j=0; j< column; j++) {
        		res[j][i] = A[i][j];
        	}
        }
        
		
		return res;
    }

}
