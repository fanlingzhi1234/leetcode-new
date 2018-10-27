package String;

import java.util.Random;

/**
 * 709. To Lower Case
 * @author Reuxs
 *Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"
 */
public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aString = "Hello";
		String bString = "here";
		String cString = "LOVELY";
		
		aString= toLowerCase(aString);
		System.out.println(aString);
		bString= toLowerCase(bString);
		System.out.println(bString);
		cString= toLowerCase(cString);
		System.out.println(cString);
		
		
	}
	
	public static String toLowerCase(String str) {
        
		char[] a = str.toCharArray();
		for(int i=0; i< str.length();i++) {
			if('A' <= a[i] && a[i] <= 'Z') {
				a[i] = (char) (a[i] - 'A' + 'a');
			}
		}
		return new String(a);
    }
}
