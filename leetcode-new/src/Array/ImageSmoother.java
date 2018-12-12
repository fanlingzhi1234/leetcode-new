package Array;
/**
* @author Rexus 
* @version Build Time：Dec 12, 2018 2:30:00 PM
* @Explain
* 
* 661. Image smoother
* 
* Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.

Example 1:
Input:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
Output:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
Explanation:
For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
For the point (1,1): floor(8/9) = floor(0.88888889) = 0
*/
public class ImageSmoother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
		System.out.println(imageSmoother(a));
	}
	//38ms 15%;
	public static int[][] imageSmoother(int[][] M) {
		
		if(M == null) return null;
		int rows = M.length;
		if(rows == 0) return new int[0][];
		int cols = M[0].length;
		int[][] result = new int[rows][cols];
		for(int row = 0; row< rows; row++) {
			for(int col = 0; col < cols; col++) {
				int count = 0;
				int sum = 0;
				for(int incR : new int[] {-1,0,1}) {
					for(int incC : new int[] {-1,0,1}) {
						if(row+incR >= 0 && row+incR < rows && col+incC >=0 && col+incC < cols ) {
							count ++;
							sum+= M[row+incR][col+incC];
						}
					}
				}
				result[row][col] = sum/count;
			}
		}
		
		
        return result;
    }
	//15ms 92%;
	public int[][] imageSmoother2(int[][] M) {  
        int nx = M.length;
        int ny = M[0].length;
        int[][] res = new int[nx][ny];
        for (int i = 0; i < nx; i++) {
            for (int j = 0; j < ny; j++) {
                res[i][j] = smooth(M, i, j);
            }
        }
        return res;
    }
    
    private int smooth(int[][] M, int x, int y) {
        int nx = M.length;
        int ny = M[0].length;
        int sum = 0;
        int count = 0;
        
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x + i < 0 || x + i >= nx || y + j < 0 || y + j >= ny) {
                    continue;
                }
                count++;
                sum += M[x + i][y + j];
            }
        }
        
        return sum / count;
    }

}
