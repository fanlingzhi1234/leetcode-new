package BinarySearch;
import java.lang.Thread.State;

/**
 * 633. Sum of Square Numbers
 * @author Reuxs
 *
 *
 *
 Given a non-negative integer c, your task is to decide whether 
 there're two integers a and b such that a2 + b2 = c.

Example 1:
Input: 5
Output: True
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:
Input: 3
Output: False

 */
public class SumofSquareNumbers {
	public static void main(String args[]) {
		int num = 27919238;
		boolean a = judgeSquareSum2(num);
		System.out.println(a);
	}
	
    static boolean judgeSquareSum(int c) {
        
    	
    	int a=0,b=0;    	
    	while(a*a < c) {
    		while(b*b <= c) {
    			if(b*b < c ) 
    				b++;
    			else if (b*b > c) {
					break;
				}
    			else
    				return true;
    		}
    		if((a*a + b*b) < c)
    			a++;
    		else if((a*a + b*b) > c)
    			break;
    		else
    			return true;
    	}
    	return false;
    }
    
    static boolean judgeSquareSum2(int c) {// Time Limit Exceeded;
    	for (long a = 0; a * a <= c; a++) {
            for (long b = 0; b * b <= c; b++) {
                if (a * a + b * b == c)
                    return true;
            }
        }
    	  
        return false;
    }
    
    static boolean judgeSquareSum3(int c) {
    	
    	
    	for(long a=0; a*a<=c; a++) {
    		double b = Math.sqrt(c - a * a);
            if (b == (int) b)
            	return true;
    	}
    	return false;
        
    	
    }
    
    
    
  
}
