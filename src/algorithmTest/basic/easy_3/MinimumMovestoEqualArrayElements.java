package algorithmTest.basic.easy_3;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElements {
	public int minMoves(int[] nums) {
		Arrays.sort(nums);
		int min = nums[0];
		int count  = 0;
		for(int i=0;i< nums.length;i++){
			count += (nums[i] - min);
		}
		return count;
	}


}
