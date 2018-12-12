package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale.LanguageRange;

/**
* @author Rexus 
* @version Build Time：Dec 11, 2018 7:55:30 PM
* @Explain
* 830. Positions of Large Groups
* In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

 

Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
 

Note:  1 <= S.length <= 1000
*/
public class PositionsOfLargeGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		System.out.println(largeGroupPositions(s));
	}
	//7ms 100%
	public static List<List<Integer>> largeGroupPositions3(String S) {
        List<List<Integer>> output = new ArrayList<>();
        if(S == null || S.trim().length() < 3) return output;
        int left = 0, right = 0;
        char[] c = (S+" ").toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] != c[left]) {
                if(right - left >= 2) {
                    List<Integer> indexList = new ArrayList<>();
                    indexList.add(left);
                    indexList.add(right);
                    output.add(indexList);
                }
                left  = i;
            }
            right = i;
        }

        return output;
    }
	// index need to add 1;
	public static List<List<Integer>> largeGroupPositions(String S) {
        
		
		int left = 0, right = 0;
		List<List<Integer>> result = new ArrayList<>();
		if(S == null || S.trim().length() < 3 ) return result;
		
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) != S.charAt(left)) {
				if(right - left >= 2) {
					List<Integer> group = new ArrayList<>();
					group.add(left);
					group.add(right);
					result.add(group); 
				}
				left = i; 
			}
			right = i;
		}
		return result;
    }
	

	//17ms  9.7%
	public static List<List<Integer>> largeGroupPositions2(String S) {
        int i = 0, j = 0, N = S.length();
        List<List<Integer>> res = new ArrayList<>();
        while (j < N) {
            while (j < N && S.charAt(j) == S.charAt(i)) 
            	++j;
            	if (j - i >= 3) 
            		res.add(Arrays.asList(i, j - 1));
            	i = j;
        }
        return res;
    }

}
