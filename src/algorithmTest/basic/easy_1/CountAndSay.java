package algorithmTest.basic.easy_1;

import java.util.LinkedList;
import java.util.Queue;

public class CountAndSay {
	public String countAndSay(int n) {
		Queue<Integer> que_in = new LinkedList<>();
		Queue<Integer> que_out = new LinkedList<>();
		que_in.add(1);
		
		int count, current;
		for (int i = 1; i < n; i++) {
			count = 0;
			current = que_in.peek();
			while (!que_in.isEmpty()) {
				if (current != que_in.peek()) {
					que_out.add(count);
					que_out.add(current);
					current = que_in.poll();
					count = 1;
				} else {
					que_in.poll();
					count++;
				}

			}
			que_out.add(count);
			que_out.add(current);
			que_in = que_out;
			que_out = new LinkedList<>();
		}
		StringBuilder sb = new StringBuilder();
		while (!que_in.isEmpty()) {
			sb.append(String.valueOf(que_in.poll()));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new CountAndSay().countAndSay(3));
	}
}
