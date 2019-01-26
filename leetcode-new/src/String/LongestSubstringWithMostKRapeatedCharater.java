package String;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.HashMap;

/**
* @author Rexus 
* @version Build Time：Jan 24, 2019 3:49:23 PM
* @Explain
* 395. Longest Substring with At Least K Repeating Characters
* 
* Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.

Example 1:

Input:
s = "aaabb", k = 3

Output:
3

The longest substring is "aaa", as 'a' is repeated 3 times.
Example 2:

Input:
s = "ababbc", k = 2

Output:
5

The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
*/
public class LongestSubstringWithMostKRapeatedCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabb";
		int k = 3;
		System.out.println(longestSubstring(s, k));

	}
	//2ms , 98%, recriter
	public static int longestSubstring(String s, int k) {
		
		
        if(s == null || s.length() == 0 ) return 0;
        int[] charaters = new int[26];
        for(int i = 0; i< s.length(); i++) {
        	charaters[s.charAt(i) - 'a'] ++;
        }
        boolean flag = true;
        for(int i = 0; i< charaters.length; i++) {
        	if(charaters[i] >0 && charaters[i] < k) {
        		flag = false;
        	}
        }
        if(flag == true) return s.length();
        int start = 0, cur = 0, result = 0;
        
        while(cur < s.length()) {
        	if(charaters[s.charAt(cur) - 'a'] <k) {
        		result = Math.max(result, longestSubstring(s.substring(start, cur), k));
        		start = cur+1;
        	}
        	cur++;
        }
        result = Math.max(result, longestSubstring(s.substring(start), k));
        return result;
        
        
    }
	
    

}
