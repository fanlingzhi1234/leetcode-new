package LinkedList;
/**
 * 83. Remove Duplicates from Sorted List
 * @author Reuxs
 *
 *
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */
public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode deleteDuplicates(ListNode head) {
        
        ListNode pre = head;
        if(head.next == null) return null;
        while (pre.next != null) {
        	if(pre.next.val == pre.val) {
        		pre.next = pre.next.next;
        	}
        	else
        		pre = pre.next;
        }
        return head;
    }
	
	    

}
