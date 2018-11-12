package Array;
/**
 * 695. Max Area of Island;
 * @author Rexus
 * 
 *Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:

{{0,0,1,0,0,0,0,1,0,0,0,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,1,1,0,1,0,0,0,0,0,0,0,0},
 {0,1,0,0,1,1,0,0,1,0,1,0,0},
 {0,1,0,0,1,1,0,0,1,1,1,0,0},
 {0,0,0,0,0,0,0,0,0,0,1,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,0,0,0,0,0,0,1,1,0,0,0,0}}
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:

{{0,0,0,0,0,0,0,0}}
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50.
 */

public class MaxAreaOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,1,1,0,1,0,0,0,0,0,0,0,0},
		                {0,1,0,0,1,1,0,0,1,0,1,0,0},
		                {0,1,0,0,1,1,0,0,1,1,1,0,0},
		                {0,0,0,0,0,0,0,0,0,0,1,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		System.out.println(maxAreaOfIsland(nums));
	}
	
	//use dfs 28ms, 36%; if we add visited to -1, 24ms 54%
	public static int maxAreaOfIsland(int[][] grid) {
		if(grid.length == 0 || grid[0].length == 0){
	        return 0;    
	    }
        int res=0;
        
        for( int i=0; i< grid.length; i++) {
        	for(int j=0; j< grid[0].length;j++) {
        		if(grid[i][j] == 1) {
        			res = Math.max(res,AreaOfIsland(grid,i,j));
        		}
        	}
        }
        
        return res;
    }
	public static int AreaOfIsland(int[][] grid, int i, int j) {
		
		if(i >= 0 && i< grid.length && j>=0 && j< grid[0].length && grid[i][j] ==1) {
			grid[i][j] = 0;
			return 1 + AreaOfIsland(grid, i+1, j) + AreaOfIsland(grid, i-1, j) + AreaOfIsland(grid, i, j+1) + AreaOfIsland(grid, i, j-1);
		}
		
		return 0;
	}
	
	//14ms 100%
	public int maxAreaOfIsland2(int[][] grid) {
	    if(grid.length == 0 || grid[0].length == 0){
	        return 0;    
	    }
	    int m = grid.length, n = grid[0].length;
	    int max = 0;
	    int[] count = new int[1];
	    for(int i = 0; i < m; i++){
	        for(int j = 0; j < n; j++){
	            if(grid[i][j] == 1){
	                count[0] = 0;
	                dfs(grid, i, j, m, n, count);       
	                max = Math.max(count[0], max);
	            }
	        }
	    }
	    return max;
	}

	private void dfs(int[][] grid, int i, int j, int m, int n, int[] count){
	    if(i < 0 || j < 0 || i>= m || j >= n || grid[i][j] != 1){
	        return;    
	    }
	    //marked visited;
	    grid[i][j] = -1;
	    count[0]++;
	    dfs(grid, i + 1, j, m, n, count);
	    dfs(grid, i - 1, j, m, n, count);
	    dfs(grid, i, j + 1, m, n, count);
	    dfs(grid, i, j - 1, m, n, count);
	}
	
	
    
    
}
