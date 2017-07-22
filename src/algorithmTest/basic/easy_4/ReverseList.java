package algorithmTest.basic.easy_4;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if(head == null) return null;
		Stack<ListNode> stack = new Stack<>();
		ListNode current  = head;
		while(current != null){
			stack.push(current);
			current = current.next;
		}
		ListNode pre = stack.pop();
		head = pre;
		while(!stack.isEmpty()){
			current = stack.pop();
			pre.next = current;
			pre = current;
		}
		pre.next =null;
		return head;
		
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
