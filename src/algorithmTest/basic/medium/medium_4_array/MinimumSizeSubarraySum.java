package algorithmTest.basic.medium.medium_4_array;

public class MinimumSizeSubarraySum {

	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 0)
		    return 0;
		int results[] = new int[nums.length];
		for(int i = 0;i < nums.length;i++){
			results[i] = nums[i];
            if(nums[i] >= s){
                return 1;
            }
		}
		for(int gap = 1; gap < nums.length;gap++){
			for(int i = 0;i < nums.length - gap;i++){
				results[i] += nums[i + gap];
				if(results[i] >= s){
					return gap+1;
				}
			}
		}
		return 0;
	}

}
