package Array;


import java.util.ArrayList;
import java.util.List;
/**
 * 22. Generate Parentheses
 * @author Reuxs
 *
 *
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		System.out.println(generateParenthesis(n));
	}
	
	public static List<String> generateParenthesis(int n) {
        String a = "";
        List<String> b = new ArrayList<String>();
        generateParenthesis(b, a, 0, 0, n);
        return b;
    }
	
	public static void generateParenthesis(List list, String str, int open, int close, int max ){
		
		if(str.length() == max*2) {
			list.add(str);
			return;
		}
			
		
		
		if(open < max) {
			generateParenthesis(list, str+"(", open+1, close, max);
		}
		
		if(open > close) {
			generateParenthesis(list, str+")", open, close+1, max);
		}
		
		
	}

}
