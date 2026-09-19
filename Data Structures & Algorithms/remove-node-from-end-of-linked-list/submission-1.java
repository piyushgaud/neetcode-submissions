/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
    	int length = 0;
    	ListNode cur = head;
    	while(cur!=null)
    	{
    		length++;
    		cur = cur.next;
    	}
    	
    	int counter = length-n;
    	if(counter==0) return head.next;
    	cur = head;
    	for(int i=1;i<counter;i++)
    	{
    		cur = cur.next;
    	}
    	cur.next = cur.next.next;    	
    	return head;
    }
}
