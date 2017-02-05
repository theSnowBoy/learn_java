package algorithmTest.basic.easy_1;

/*
 * 模拟加法。
 * 心得：
 * 1.变量的使用要适合，要设计的可以通过循环批次处理。
 * 2.有些地方容易出现模糊，需要分清这些地方。
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
			current1 = (current1 != null ? current1.next : null);// 这里出现糊涂
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
		// 这里容易犯糊涂。
		// 正向第 count -n +1个。
		// 实际正向位置为 count - n + 1 -1.
		for (int i = 0; i < count - n; i++) {
			pre = current;
			current = current.next;
		}
		pre.next = current.next;

		return head;
	}

	public ListNode swapPairs(ListNode head) {
		ListNode headNew = new ListNode(0);//(new)增加了头指针，简化了代码
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
