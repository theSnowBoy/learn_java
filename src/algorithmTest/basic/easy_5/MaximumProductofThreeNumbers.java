package algorithmTest.basic.easy_5;

public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        for(int i = 0; i < 3;i++){
        	for(int j = nums.length - 1; j > i;j--){
        		if(nums[j-1] < nums[j]){
        			int tmp = nums[j-1];
        			nums[j-1] = nums[j];
        			nums[j] = tmp;
        		}
        	}
        }
        
        int max0=nums[0],max1=nums[1],max2=nums[2]; 
        
        for(int i = 0; i < 2;i++){
        	for(int j = nums.length - 1; j > i;j--){
        		if(nums[j-1] > nums[j]){
        			int tmp = nums[j-1];
        			nums[j-1] = nums[j];
        			nums[j] = tmp;
        		}
        	}
        }
        
        int min0 = nums[0],min1 = nums[1];
        int sum1 = max0 * max1 * max2;
        int sum2 = max0 * min0 * min1;

        return sum1 > sum2 ? sum1:sum2;
    }
}
