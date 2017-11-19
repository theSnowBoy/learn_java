package algorithmTest.basic.easy9_array;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
    	if(nums.length == 0){
    		return 0;
    	}
        int max = Integer.MIN_VALUE;
        int end = 0;
        for(int i = 0; i < nums.length ; i++){
        	if(max <= nums[i]){
        		max = nums[i];
        	}else{
        		end = i;
        	}
        }
        
        int min = Integer.MAX_VALUE;
        int start = 0;
        for(int i = nums.length -1 ; i >= 0 ; i--){
        	if(min >= nums[i]){
        		min = nums[i];
        	}else{
        		start = i;
        	}
        }
        if(start == end){
        	return 0;
        }else{
        	return end -start +1;
        }
    }
}
