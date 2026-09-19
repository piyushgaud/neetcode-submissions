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
    public ListNode mergeKLists(ListNode[] lists) {
            
    	
    	if(lists==null || lists.length==0) return null;
    	PriorityQueue<ListNode> minQueue = new PriorityQueue<ListNode>((a,b)->a.val-b.val);
    	
    	for(int i=0;i<lists.length;i++)
    	{
            if(null!=lists[i])
    		{
                minQueue.offer(lists[i]);
            }
    	}
    	ListNode dummy = new ListNode();
    	ListNode tmp = dummy;
    	while(!minQueue.isEmpty())
    	{
    		ListNode pol = minQueue.poll();
    		tmp.next = pol;
    		tmp = tmp.next;
    		if(pol.next!=null)
    		{
    			minQueue.offer(pol.next);
    		}
    	}    	    	
    	return dummy.next;
    
    }
}
