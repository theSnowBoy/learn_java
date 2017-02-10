package algorithmTest.basic.medium.medium_1;

public class CountBit {
	public int[] countBits(int num) {
		int[] results = new int[num+1];
		for(int i =0;i<num+1;i++){
			results[i] = Integer.bitCount(i);
		}
		return results;
	}
}
