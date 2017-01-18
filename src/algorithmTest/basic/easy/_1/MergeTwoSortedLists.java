package algorithmTest.basic.easy._1;

import algorithmTest.basic.easy._1.AddTwo.ListNode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode head = result;
		ListNode current1 = l1;
		ListNode current2 = l2;
		while(current1 != null && current2 != null){
			if(current1.val < current2.val){
				result.next = current1;
				current1 =  current1.next;
				result = result.next;
			}else{
				result.next = current2;
				current2 = current2.next;
				result = result.next;
			}
		}
		if(current1 != null) {
			result.next = current1;
		}
		if(current2 != null) {
			result.next = current2;
		}
		return head.next;
		
	}
	
	//网上的递归实现。
	 public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
	        if(l1 == null){
	            return l2;
	        }
	        if(l2 == null){
	            return l1;
	        }
	        
	        ListNode mergeHead;
	        if(l1.val < l2.val){
	            mergeHead = l1;
	            mergeHead.next = mergeTwoLists(l1.next, l2);
	        }
	        else{
	            mergeHead = l2;
	            mergeHead.next = mergeTwoLists(l1, l2.next);
	        }
	        return mergeHead;
	    }
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
