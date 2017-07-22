package algorithmTest.basic.easy_4;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
    	if(nums == null || nums.length == 0) return 0;
        int[] opt = new int[nums.length];
        int max = opt[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
        	opt[i] = opt[i-1] > 0 ?(opt[i-1] + nums[i]):nums[i];
        	if(max < opt[i]){
        		max = opt[i];
        	}
        }
        return max;
    }

}
