package Array;


/**
 * 925. Long Pressed Name
 * @author Reuxs
 *Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
Example 3:

Input: name = "leelee", typed = "lleeelee"
Output: true
Example 4:

Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
 */

public class LongPressName {

	public static void main(String[] args) {
		
		String name = "alex";
		String typed = "aaleeex";
		
		if(isLongPressedName2(name,typed)==true)
			System.out.println("yes");
		else
			System.out.println("no");
		

	}
	
	public static boolean isLongPressedName(String name, String typed) {
        
        int namecount=0;
		int typedcount=0;
		int i=0,j=0;
		
		
		/*Stack<Character> stack = new Stack<>();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i+1) == name.charAt(i)) {
				namecount ++;
				continue;
			}
			for(int j=0;j<typed.length();j++) {
				
				if(typed.charAt(j) == name.charAt(i)) {
					continue;
				}
			}
		}*/
		while(i<name.length() && j<typed.length()){
			if(name.charAt(i+1) == name.charAt(i)) {
				namecount ++;
				i++;
			}
			
			else {
				if(typed.charAt(j) == name.charAt(i)) {
					typedcount ++;
					j++;
				}
				else {
					if(namecount <= typedcount) {
						i++;
					}
					else 
						return false;
				}
			}
		}
		
		return true;
    }
	
	public static boolean isLongPressedName2(String name, String typed) {
        int slow = 0;
        int fast = 0;

        while (slow < name.length() && fast < typed.length()) {
            if (name.charAt(slow) == typed.charAt(fast)) {
                slow++;
                fast++;
            }
            else if (fast > 0 && typed.charAt(fast) == typed.charAt(fast-1)) {
                fast++;
            }
            else {
                return false;
            }
        }

        while (fast < typed.length()) {
            if (typed.charAt(fast) != typed.charAt(fast-1)) {
                return false;
            }

            fast++;
        }

        return slow == name.length();
    }
}
