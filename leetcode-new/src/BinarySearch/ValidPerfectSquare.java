package BinarySearch;
/**
 * 367. Valid Perfect Square
 * @author Reuxs
 *
 *
 *
 Given a positive integer num, write a function which returns True 
 if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false


 */
public class ValidPerfectSquare {
	public static void main(String args[]) {
		int num = 16;
		
		boolean a = isPerfectSquare(num);
		System.out.println(a);
	}
	
	static boolean isPerfectSquare(int x) {
		
		long r = x;
        while(r*r>x) {
        	r = (r+x/r) /2;
        	
        }
        if(r*r == x)
        	return true;
        else
        	return false;
            
    }
}
