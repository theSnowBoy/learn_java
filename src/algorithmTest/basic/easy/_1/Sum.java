package algorithmTest.basic.easy._1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sum {
	
	    public int[] twoSum1(int[] nums, int target) {

	    	int tmp;
	    	int [] result = new int[2];
	    	for(int i = 0 ; i < nums.length; ++i){
	    		tmp = nums[i];
	    		for(int j = i+1; j < nums.length;++j){
	    			if(target == tmp + nums[j]){
	    				result[0] = i;
	    				result[1] = j;
	    				return result;
	    			}
	    		}
	    	}
	    	return null;
    
	    }
	    public int[] twoSum(int[] nums, int target) {
	    	int sum;
	    	int []numsUse = nums;
	    	int [] result = new int[2];
	    	int [] data = new int[2];
	    	int start = 0;
	    	int end = nums.length;
	    	
	    	Arrays.sort(numsUse);
	    	
	    	for(int i = start ; i < end; ++i){
	    		
	    		for(int j = end-1; j > i;++j){
	    			
	    			sum = numsUse[i] + numsUse[j];
	    			
	    			if(target == sum){
	    				data[0] = numsUse[i];
	    				data[1] = numsUse[j];
	    			}else if(target < sum){
	    				end = j;
	    			}
	    		}
	    	}
	    	
	    	for(int i = 0 ; i <nums.length;i++){
	    		
	    	}
	    	return null;
    
	    }
}
