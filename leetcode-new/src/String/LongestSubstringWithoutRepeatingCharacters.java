package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author Rexus 
* @version Build Time：Jan 21, 2019 6:50:14 PM
* @Explain
* 3. Longest Substring Without Repeating Characters
* Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = " ";
		System.out.println(lengthOfLongestSubstring2(aString));
	}
	// can not pass without letter.
	public static int lengthOfLongestSubstring(String s) {
		if(s == null && s ==" ") return 0;
        int result = 0;
        int count =0;
        for(int i = 0; i < s.length(); i++) {
        	int[] a = new int[26];
        	a[s.charAt(i) - 97] = 1;
        	count += 1;
        	for( int j = i+1; j < s.length(); j++) {
        		a[s.charAt(j) - 97] += 1;
        		if(a[s.charAt(j) - 97] >1) {
        			break;
        		}
        		else {
        			count +=1;
        		}
        	}
        	result = Math.max(result, count);
        	count = 0;
        }
        return result;
        
       
    }
	// hashset 28ms 77%
	public static int lengthOfLongestSubstring2(String s) {
		Set<Character> set = new HashSet<>();
		int max = 0;
		int j = 0, i = 0;
		
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		return max;
	}


}
