package algorithmTest.basic.easy_1;

/*
 * ģ��ӷ���
 * �ĵã�
 * 1.������ʹ��Ҫ�ʺϣ�Ҫ��ƵĿ���ͨ��ѭ�����δ���
 * 2.��Щ�ط����׳���ģ������Ҫ������Щ�ط���
 */
public class AddTwo {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode current1 = l1;
		ListNode current2 = l2;

		ListNode result = new ListNode(0);
		ListNode head = result;
		int carry = 0;

		while (current1 != null || current2 != null || carry != 0) {
			int sum = 0;
			sum += (current1 != null ? current1.val : 0);
			sum += (current2 != null ? current2.val : 0);
			sum += carry;
			result.next = new ListNode(sum % 10);
			carry = sum / 10;
			current1 = (current1 != null ? current1.next : null);// ������ֺ�Ϳ
			current2 = (current2 != null ? current2.next : null);
			result = result.next;

		}
		return head.next;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode current = head;
		ListNode pre = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}

		if (count < n)
			return head;
		if (count == n)
			return head.next;

		current = head;
		// �������׷���Ϳ��
		// ����� count -n +1����
		// ʵ������λ��Ϊ count - n + 1 -1.
		for (int i = 0; i < count - n; i++) {
			pre = current;
			current = current.next;
		}
		pre.next = current.next;

		return head;
	}

	public ListNode swapPairs(ListNode head) {
		ListNode headNew = new ListNode(0);//(new)������ͷָ�룬���˴���
		headNew.next = head;
		ListNode toChange1 = head;
		ListNode toChange2;
		ListNode pre = headNew;
		while(toChange1 != null && toChange1.next != null){
			toChange2 = toChange1.next;
			pre.next = toChange2;
			toChange1.next = toChange2.next;
			toChange2.next = toChange1;
			pre = toChange1;
			toChange1 = toChange1.next;
		}
		return headNew.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
