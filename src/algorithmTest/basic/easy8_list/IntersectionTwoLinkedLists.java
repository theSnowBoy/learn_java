package algorithmTest.basic.easy8_list;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class IntersectionTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null){
			return null;
		}
		LinkedList<ListNode> stackA = new LinkedList();
		
		ListNode pointer = headA;
		while(pointer != null){
			stackA.push(pointer);
			pointer = pointer.next;
		}
		
		LinkedList<ListNode> stackB = new LinkedList();
		pointer = headB;
		while(pointer != null){
			stackB.push(pointer);
			pointer = pointer.next;
		}
		
		pointer = null;
		while(!stackA.isEmpty() && !stackB.isEmpty()){
			//当作栈来使用时，则list第一个元素为栈顶元素。
			if(stackA.peekFirst() == stackB.peekFirst()){
				pointer = stackA.pop();
				stackB.pop();
			}else{
				break;
			}
		}
		return pointer;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
