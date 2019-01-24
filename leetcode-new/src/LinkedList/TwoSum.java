package LinkedList;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.awt.print.Printable;

/**
* @author Rexus 
* @version Build Time：Jan 21, 2019 5:52:15 PM
* @Explain
* 2. add two numbers
* 
* You are given two non-empty linked lists representing two non-negative integers. 
* The digits are stored in reverse order and each of their nodes contain a single digit. 
* Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/


  
  
 
public class TwoSum {

	public class ListNode {
		int val;
		ListNode next;	
		ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		System.out.println( (1+45) %10);
		
		
		//System.out.println(addTwoNumbers(l1,l2));
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode root = new ListNode(0);
		if(l1.val+l2.val > 10) carry+=1;
		while(l1.next!= null && l2.next != null) {
			l1 = l1.next;
			l2 = l2.next;
			root = root.next;
			root.val = ((l1.val+l2.val) + carry)%10;
			carry = 0;
			if(l1.val+l2.val > 10) carry+=1;
		}
		while(l1.next != null) {
			root.next = new ListNode((l1.next.val+carry)%10) ;
			carry =0;
		}
		while(l2.next != null) {
			root.next = new ListNode((l2.next.val+carry)%10);
			carry=0;
		}
		return root;
        
    }
	//35ms, 40%
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	//recursion,
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
        ListNode head = new ListNode(val % 10);
        head.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        if (val >= 10) head.next = addTwoNumbers(head.next, new ListNode(1));
        return head;
    }

}
