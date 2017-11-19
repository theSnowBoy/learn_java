package algorithmTest.basic.easy8_list;

import java.util.HashSet;

import algorithmTest.basic.easy8_list.IntersectionTwoLinkedLists.ListNode;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		
		//������������
		while (head.next != null && head.next.next != null) {
			if (head.next == head) {
				return true;
			}
			head.next = head.next.next;//����
			head = head.next;//�ƶ�
		}
		return false;
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
