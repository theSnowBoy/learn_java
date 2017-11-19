package algorithmTest.basic.medium.medium_4_array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 1){
        	return true;
        }
        
        int preIndex = -1;
        int currentIndex = nums[0];
        while(currentIndex < nums.length-1 && preIndex < currentIndex){
        	int tmpCurrent = currentIndex;
        	for(int i = ++preIndex; i <= tmpCurrent ; i++){
        		if(preIndex + nums[preIndex] <= i + nums[i]){
        			preIndex = i;
        			currentIndex = i +nums[i];
        		}
        	}
        }
        return currentIndex >= nums.length -1 ? true : false ;
    }
}
