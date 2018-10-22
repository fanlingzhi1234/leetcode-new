package LinkedList;
/**
 * 21. Merge Two Sorted Lists
 * @author Reuxs
 *
 *
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newlist = new ListNode(0);
        
        ListNode fh1 = new ListNode(-1);
        ListNode fh2 = new ListNode(-1);
        
        fh1.next = l1;
        fh2.next = l2;
        
        while (l1 != null || l2 != null) {
        	if(fh1.next.val <= fh2.next.val){
        		newlist = fh1.next;
        		fh1 = fh1.next;
        	}
        	else 
        		newlist = fh2.next;
        		fh2 = fh2.next;
        }
        return newlist;
    }
	
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(-1);
        ListNode headNode = returnNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }
        if (l1 == null) {
            returnNode.next = l2;
        } else if (l2 == null) {
            returnNode.next = l1;
        }
        return headNode.next;
    }
}
