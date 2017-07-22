package algorithmTest.basic.easy_5;

import java.util.Stack;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> result = new Stack<>();
		while(l1 != null){
			s1.push(l1.val);
			l1 = l1.next;
		}
		while(l2 != null){
			s2.push(l2.val);
			l2 = l2.next;
		}
		
		int pre = 0;
		int num1 = 0;
		int num2 = 0;
		while(!s1.isEmpty() || !s2.isEmpty() || pre > 0){
			num1 = (s1.isEmpty() ? 0:s1.pop());
			num2 = (s2.isEmpty() ? 0:s2.pop());
			result.push((num1 + num2 +pre)%10);
			pre = (num1 + num2 +pre)/10;
		}
		ListNode p = new ListNode(result.pop());
		ListNode head =p;
		while(!result.isEmpty()){
			p.next = new ListNode(result.pop());
			p = p.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
