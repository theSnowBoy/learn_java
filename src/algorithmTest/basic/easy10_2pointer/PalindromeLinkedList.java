package algorithmTest.basic.easy10_2pointer;

import java.util.LinkedList;

public class PalindromeLinkedList {
	 public boolean isPalindrome(ListNode head) {
	       
			if(head == null){
	            return true;
	        }
			ListNode p = head;
			int nodeNum =  0;
			while(p != null){
				nodeNum ++;
				p = p.next;
			}
			
			p = head;
			ListNode p2 = head.next;
			head.next = null;
			for(int i = 1; i < nodeNum/2;i++){
				ListNode tmp = p2.next;
				p2.next = p;
				p = p2;
				p2 = tmp;
			}
			
			if(nodeNum%2 != 0 && p2 != null){
				p2 = p2.next;
			}
			
			while(p != null && p2 != null){
				if(p.val != p2.val){
					return false;
				}
				p = p.next;
				p2 = p2.next;
			}	
			
			return true;
		
	    }

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
