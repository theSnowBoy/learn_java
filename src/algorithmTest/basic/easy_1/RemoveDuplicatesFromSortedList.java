package algorithmTest.basic.easy_1;

public class RemoveDuplicatesFromSortedList {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return null;
		ListNode current = head;
		while(current.next != null){
			if(current.val == current.next.val){
				current.next = current.next.next;
			}else{
				current = current.next;
			}
		}
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
