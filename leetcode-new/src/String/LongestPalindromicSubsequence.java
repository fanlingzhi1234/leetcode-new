package String;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
* @author Rexus 
* @version Build Time：Jan 24, 2019 5:49:34 PM
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
public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "cabbeaf";
		System.out.println(longestPalindromeSubseq(s));

	}
	//time limit exceeded
	public static int longestPalindromeSubseq(String s) {
		int n = s.length();
		return longestPalindromeSubseq(s,0,n-1);
    }
	
	public static int longestPalindromeSubseq(String s, int i, int j) {
		if(i == j) return 1;
		if(i > j) return 0;
		
		if(s.charAt(i) == s.charAt(j)) {
			return longestPalindromeSubseq(s, i+1, j-1) + 2;
		}
		else {
			return Math.max(longestPalindromeSubseq(s, i+1,j), longestPalindromeSubseq(s,i,j-1));
		}
	}
	

}
