package algorithmTest.basic.easy_1;

public class NextGreatNumber {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int results[] = new int[findNums.length];
		for (int j = 0; j < findNums.length; j++) {
			boolean findBigger = false;
			boolean isRight = false;
			
			for (int i = 0; i < nums.length; i++) {
				
				if (nums[i] == findNums[j]) {
					isRight = true;
				}
				
				if (isRight && findNums[j] < nums[i]) {
					results[j] = nums[i];
					findBigger = true;
					break;
				}
			}
			
			if (!findBigger) {
				results[j] = -1;
			}
		}
		return results;
	}
}
