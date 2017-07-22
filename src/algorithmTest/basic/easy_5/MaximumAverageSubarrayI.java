package algorithmTest.basic.easy_5;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
    	int max = 0,sum = 0;
    	for(int i = 0;i < k;i++){
    		sum += nums[i];
    	}
    	max = sum;
        for(int i = k; i < nums.length;i++){
        	sum = sum + nums[i] - nums[i-k];
        	max = sum > max? sum: max;
        }
        return max/1.0/k;
    }
}
