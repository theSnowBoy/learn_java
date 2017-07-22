package algorithmTest.basic.medium.medium_1;

import java.util.Arrays;

public class KthLargestElementinArray {

	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

}
