package LinkedList;

/**
 * 82. Remove Duplicates from Sorted List II
 * @author Reuxs
 *
 *
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
 */

public class RemoveDuplicatesfromSortedList2 {

	 public ListNode deleteDuplicates2(ListNode head) {
		 
		ListNode Fakehead = new ListNode(0);
		ListNode pre = Fakehead;
		ListNode cur = head;
		 
		Fakehead.next = head;
		if(head == null) return null;
		 
		 
		while(cur!=null){
			while(cur.next != null && cur.val == cur.next.val){
				cur=cur.next;
            }
	        if(pre.next==cur){
	            pre=pre.next;
	        }
	        else{
	        	pre.next=cur.next;
	        }
	        cur=cur.next;
	    }
	    return Fakehead.next;
     }
}

