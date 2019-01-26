package Other;
/**
* @author Rexus 
* @version Build Time：Jan 25, 2019 5:02:59 PM
* @Explain
* 
* 7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


*/
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 120;
		System.out.println(reverse(a));
	}
	
	//19ms, 78%;
	public static int reverse(int x) {
		boolean isNegative = x < 0;
		x = isNegative ? x * -1 : x;
		
		String s = Integer.toString(x);
		char[] chars = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= chars.length; i++) {
			sb.append(chars[chars.length - i]);
		}
		try {
			return isNegative ? -1 * Integer.valueOf(sb.toString()) : Integer.valueOf(sb.toString());
		}catch(NumberFormatException e) {
			return 0;
		} 
    }	

}
