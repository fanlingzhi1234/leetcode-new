package LinkedList;
/**
 * 203. Remove Linked List Elements
 * @author Reuxs
 *
 *
 *Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

 */
public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
        ListNode aa = new ListNode(-1);
        aa.next = head;
        ListNode pre = aa;
		if(pre.next == null)
        	return head;
        while(pre.next != null) {
        	if(pre.next.val == val) {
        		pre.next = pre.next.next;
        	}
        	else {
				pre = pre.next;
			}
        }
        return head;
    }
}
