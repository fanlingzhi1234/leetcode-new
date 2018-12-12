package Array;
/**
* @author Rexus 
* @version Build Time：Dec 7, 2018 10:27:00 AM
* @Explain
* 58. Length of Last Word
* 
* Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "";
		System.out.println(lengthOfLastWord(aString));
	}
	
	public static int lengthOfLastWord(String s) {
        
        String[] a = s.split(" ");
        if(a.length ==0) return 0;
        return a[a.length-1].length();
    }

}
