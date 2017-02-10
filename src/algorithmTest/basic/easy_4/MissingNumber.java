package algorithmTest.basic.easy_4;

import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int all = (0 +nums.length )*(nums.length+1)/2;
		int fact = 0;
		for(int i = 0;i <nums.length;i++){
			fact += nums[i];
		}
		return all -fact;
	
    }
}
