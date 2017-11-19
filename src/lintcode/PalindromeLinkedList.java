package lintcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		
		if(head == null){
			return false;
		}
        // write your code here
		LinkedList<ListNode> stack = new LinkedList<>();
		
    	ListNode start = head;
    	while(start != null){
    		stack.push(start);
    		start = start.next;
    	}
    	start = head;
    	while(!stack.isEmpty()){
    		if(start.val != stack.pop().val){
    			return false; 
    		}
    		start = start.next;
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
