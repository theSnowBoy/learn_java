package wang163;

import java.util.Scanner;

public class MainHand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] data = new int[n];
			for (int i = 0; i < n; i++) {
				data[i] = sc.nextInt();
			}

			int first = 0;
			for (int j = 0; j < k; j++) {
				for (int i = 0; i < n; i++) {
					if (i == 0) {
						first = data[i];
					} else if (i == n - 1) {
						data[i] = (data[i] + first) % 100;
						continue;
					}
					data[i] = (data[i] + data[i + 1]) % 100;
				}
			}

			System.out.print(data[0]);
			for (int i = 1; i < n; i++) {
				System.out.print(" ");
				System.out.print(data[i]);
			}
			System.out.println();
		}
	}

}
