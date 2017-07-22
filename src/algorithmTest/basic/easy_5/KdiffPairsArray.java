package algorithmTest.basic.easy_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KdiffPairsArray {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i <nums.length ; i++){
        	for(int j = i+1; j < nums.length ; j++){
        		
        		if(i > 1 && nums[i] != nums[i-1]){
        			break;
        		}
        		
        		if(k == nums[j] - nums[i]){
        			if(nums[j] != nums[j-1]){
        				count++;
            		}
        		}else if(k < nums[j] - nums[i]){
        			break;
        		}
        	}
        }
        return count;
    }
}
