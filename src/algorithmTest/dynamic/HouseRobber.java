package algorithmTest.dynamic;

public class HouseRobber {
    public int rob(int[] nums) {
    	if(nums.length == 0 )return 0;
    	if(nums.length == 1) return nums[0];
    	if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int pre_pre = nums[0];
        int pre = Math.max(nums[0], nums[1]);
        int sum = 0;
        for(int i = 2; i < nums.length; i++){
        	sum = Math.max(pre, pre_pre+nums[i]);
        	pre_pre = pre;
        	pre = sum;
        }
        return sum;
    }
}
