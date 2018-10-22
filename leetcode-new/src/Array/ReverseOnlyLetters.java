package Array;
/**
 * 917. Reverse Only Letters
 * @author Reuxs
 *Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 

Note:

S.length <= 100
33 <= S[i].ASCIIcode <= 122 
S doesn't contain \ or "
 */
public class ReverseOnlyLetters {
	
	public static void main(String args[]) {
		String string = "dkk-k1k1k-3dxk=vv";
		String result = ReverseOnlyLetters.reverse(string);
		System.out.println(result);
	}
	
	public static String reverse(String s) {
		char[] c = s.toCharArray();
		int left=0;
		int right = c.length - 1;
		
		while(left<=right) {
			while(left<right && !Character.isLetter(c[left])) {
				left ++;
			}
			
			while (left<right && !Character.isLetter(c[right])) {
				right --;
			}
			
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			
			left++;
			right--;
		}
		return new String(c);
		
	}
	
	
}
