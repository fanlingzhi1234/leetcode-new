package BFSDFS;
/**
* @author Rexus 
* @version Build Time：Feb 19, 2019 5:10:45 PM
* @Explain
* 994. Rotting Oranges
* 
* In a given grid, each cell can have one of three values:

the value 0 representing an empty cell;
the value 1 representing a fresh orange;
the value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.

 

Example 1:



Input: [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
Example 2:

Input: [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: [[0,2]]
Output: 0
Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 

Note:

1 <= grid.length <= 10
1 <= grid[0].length <= 10
grid[i][j] is only 0, 1, or 2.

*/
public class RottingOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(grid));
	}
	
	private static int rot(int[][] g, int i, int j, int d) {
		if (i < 0 || j < 0 || i >= g.length || j >= g[i].length || g[i][j] != 1) 
			return 0;
		g[i][j] = d + 3;
		return 1;
	}
	//10ms 100%
	public static int orangesRotting(int[][] g) {
		int fresh = 0, d = 0;
		for (int i = 0; i < g.length; ++i)
		for (int j = 0; j < g[i].length; ++j)
			if (g[i][j] == 1) ++fresh;
		for (int old_fresh = fresh; fresh > 0; ++d, old_fresh = fresh) {
			for (int i = 0; i < g.length; ++i)
				for (int j = 0; j < g[i].length; ++j)
					if (g[i][j] == d + 2)
						fresh -= rot(g, i + 1, j, d) + rot(g, i - 1, j, d) + rot(g, i, j + 1, d) + rot(g, i, j - 1, d);
		    if (fresh == old_fresh) 
		    	return -1;
		}
		return d;
		}
	

}
