package contest;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int[] people = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			people[i] = in.nextInt();
		}
		findOrigin(n, x, people);
	}

	public static void findOrigin(int n, int x, int[] people) {
		int count = 0;
		int i = x;
		while (true) {
			//到达0时说明，该处数据被清空了，用来填补之前的数据。（符合逻辑，题目的规则）
			if (people[i] == 0) {
				break;
			}
			people[i]--;
			count++;
			i = (i - 1 + n) % n == 0 ? n : (i - 1 + n) % n; // 向后退位。
		}

		people[i] = count;
		for (int j = 1; j <= n; j++) {
			if (j == 1) {
				System.out.print(people[j]);
			} else {
				System.out.print(" " + people[j]);
			}
		}
	}
}
