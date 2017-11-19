package company.grabcar;

public class Dice {
	public int solution(int[] A) {
		int[][] record = new int[7][2];// 2列：col 0中 存储 当前数字的数量，col 1冲突(和为7 )的数量。
		for (int i = 0; i < A.length; i++) {
			record[A[i]][0]++;
			record[7 - A[i]][1]++;
		}
		int min = 0;
		for (int i = 1; i < 7; i++) {
			if (i == 1) {
				min = A.length - record[i][0] + record[i][1];
			} else {
				int tmp = A.length - record[i][0] + record[i][1];
				min = (min < tmp) ? min : tmp;
			}
		}
		return min;
	}
}
