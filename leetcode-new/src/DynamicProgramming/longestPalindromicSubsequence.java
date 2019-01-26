package DynamicProgramming;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;

/**
* @author Rexus 
* @version Build Time：Jan 25, 2019 4:08:53 PM
* @Explain
* 516. Longest Palindromic Subsequence
* 
* Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest palindromic subsequence is "bb".
*/
public class longestPalindromicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "bbbab";
		System.out.println(longestPalindromeSubseq2(string));
	}
	// DP, 49ms 24%
	public static int longestPalindromeSubseq(String s) {
		int len = s.length();
		int[][] dp = new int[len][len];
		
		for(int l = 1; l<= len; l++) {
			for( int i = 0; i <= len-l; i++) {
				int j = i + l - 1;
				if(i == j) {
					dp[i][j] = 1;
					continue;
				}
				if(s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i+1][j-1] +2;
				}
				else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
				}
			}
		}
		return dp[0][len-1];
	}
	//roll array
	public static int longestPalindromeSubseq2(String s) {
		int len = s.length();
		int dp0[] = new int[len];
		int dp1[] = new int[len];
		int dp2[] = new int[len];
		
		for(int l = 1; l< len; l++) {
			for(int i = 0; i <= len - l; i++) {
				int j = i + l - 1;
				if(i == j) {
					dp0[i] = 1;
					continue;
				}
				if(s.charAt(i) == s.charAt(j)) {
					dp0[i] = dp2[i+1] + 2;
				}
				else {
					dp0[i] = Math.max(dp1[i+1], dp1[i]);
				}
				swap(dp0,dp1);
				swap(dp2,dp0);
			}
		}
		return dp1[0];
	}
	public static void swap (int[] dp1, int[] dp2) {
		for(int i = 0; i<dp1.length;i++) {
			int tmp = dp1[i];
			dp1[i] = dp2[i];
			dp2[i] = tmp;
			
		}
	}
}
