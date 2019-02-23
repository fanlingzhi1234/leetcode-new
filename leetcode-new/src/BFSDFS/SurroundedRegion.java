package BFSDFS;

import java.text.DateFormatSymbols;

/**
* @author Rexus 
* @version Build Time：Feb 19, 2019 5:17:46 PM
* @Explain
* 130. Surrounded Regions
* 
* Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

Example:

X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X
Explanation:

Surrounded regions shouldn’t be on the border, which means that any 'O' on the border 
of the board are not flipped to 'X'. 
Any 'O' that is not on the border and it is not connected to an 'O' 
on the border will be flipped to 'X'. 
Two cells are connected if they are adjacent cells connected horizontally or vertically.
*/
public class SurroundedRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		solve(grid);
		for (char[] cs : grid) {
			for (char cs2 : cs) {
				System.out.print(cs2);
			}
			System.out.println();
		}
	}
	
	//3ms, 100%
	public static void solve (char[][] board) {
		if(board == null || board.length == 0 ||board[0].length == 0) return;
		if(board.length < 2 || board[0].length <2) return;
		int m = board.length;
		int n = board[0].length;
		
		for(int i = 0; i<m; i++) {
			if(board[i][0] == 'O') {
				boundarydfs(board,i,0);
			}
			if(board[i][n-1] == 'O') {
				boundarydfs(board, i, n-1);
			}
		}
		for(int j = 0; j< n ; j++) {
			if(board[0][j] == 'O') {
				boundarydfs(board, 0,j);
			}
			if(board[m-1][j] == 'O') {
				boundarydfs(board, m-1, j);
			}
		}
		for(int i =0; i<m; i++) {
			for(int j =0; j<n; j++) {
				if(board[i][j] == 'O')
					board[i][j] = 'X';
				else if(board[i][j] == '*')
					board[i][j] = 'O';
			}
		}
		
	}
	
	private static void boundarydfs(char[][] board, int i, int j) {
		if(i<0 || i>board.length -1 || j<0 || j>board[0].length -1) return;
		if(board[i][j] == 'O')
			board[i][j] = '*';
		if(i>1 && board[i-1][j] =='O')
			boundarydfs(board, i-1, j);
		if(i<board.length -2 && board[i+1][j] == 'O')
			boundarydfs(board, i+1, j);
		if(j>1 && board[i][j-1] =='O')
			boundarydfs(board, i, j-1);
		if(j<board[0].length -2 && board[i][j+1] == 'O')
			boundarydfs(board, i, j+1);
		
	}
}
