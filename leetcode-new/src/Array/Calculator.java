package Array;

import java.util.Stack;

/**
 * 227. Basic Calculator II
 * @author Reuxs
 *
 *
Implement a basic calculator to evaluate a simple expression string.

The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.

Example 1:

Input: "3+2*2"
Output: 7
Example 2:

Input: " 3/2 "
Output: 1
Example 3:

Input: " 3+5 / 2 "
Output: 5
 */
public class Calculator {
	public static int calculate(String s) {
		int len;
	    if(s==null || (len = s.length())==0) return 0;
	    Stack<Integer> stack = new Stack<Integer>();
	    int num = 0;
	    char sign = '+';
	    for(int i=0;i<len;i++){
	        if(Character.isDigit(s.charAt(i))){
	            num = num*10+s.charAt(i)-'0';
	        }
	        if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
	            if(sign=='-'){
	                stack.push(-num);
	            }
	            if(sign=='+'){
	                stack.push(num);
	            }
	            if(sign=='*'){
	                stack.push(stack.pop()*num);
	            }
	            if(sign=='/'){
	                stack.push(stack.pop()/num);
	            }
	            sign = s.charAt(i);
	            num = 0;
	        }
	    }

	    int re = 0;
	    for(int i:stack){
	        re += i;
	    }
	    return re;
    }
	
	 public int calculate2(String s) {
	        int res = 0;
	        char sign = '+';
	        for (int i = 0, num = 0, pre = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (Character.isDigit(c)) {
	                num = num * 10 + (int)(c - '0');
	            }
	            if ("+-*/".indexOf(c) >= 0 || i == s.length() - 1) {
	                if (sign == '+') {
	                    pre = num;
	                } else if (sign == '-') {
	                    pre = -num;
	                } else if (sign == '*') {
	                    res -= pre;
	                    pre *= num;
	                } else {
	                    res -= pre;
	                    pre /= num;
	                }
	                sign = c;
	                num = 0;
	                res += pre;
	            }
	        }
	        
	        return res;
	    }
	
	public static void main(String args[]) {
		String str = " 3+5 / 2";
		int result = calculate(str);
		System.out.println(result);
	}
}
