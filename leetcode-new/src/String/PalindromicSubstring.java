package String;
/**
* @author Rexus 
* @version Build Time：Jan 24, 2019 5:00:38 PM
* @Explain
* 647. Palindromic Substrings
* 
* Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
*/
public class PalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		System.out.println(countSubstring2(s));
	}
	//112ms 13%
	public static int countSubstrings(String s) {
		if(s == null || s.length() == 0) return 0;
        int count = 0;
      
        for(int i = 0 ; i < s.length(); i++) {
        	for (int j = i; j< s.length(); j++) {
        		if(isPalindromic(s,i,j)) count++;
        	}
        }
        return count;
    }
	
	public static boolean isPalindromic(String s, int start, int end) {
		
		//boolean result = true;
		int i = start, j = end;
		while(i<=j) {
			if(s.charAt(i) == s.charAt(j) ) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	//5ms 99%
	static int count = 0;
	public static int countSubstring2(String s) {
		
		if(s == null || s.length() ==0) return 0;
		
		for(int i =0 ;i<s.length(); i++) {
			extendPalindromic(s,i,i);
			extendPalindromic(s,i,i+1);
		}
		return count;
		
	}
	public static void extendPalindromic(String s, int i, int j) {
		while(i>=0 && j< s.length() && s.charAt(i) == s.charAt(j)) {
			count++;
			i--;
			j++;
		}
	}

}
