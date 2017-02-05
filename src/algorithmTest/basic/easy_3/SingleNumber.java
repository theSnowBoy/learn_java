package algorithmTest.basic.easy_3;

import java.util.Arrays;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int i;
		for( i= 0; i < nums.length ;){
			if(i+1 < nums.length && nums[i] == nums[i+1]){
				i+=2;
			}else{
				break;
			}
		}
		return nums[i];
	}
}
