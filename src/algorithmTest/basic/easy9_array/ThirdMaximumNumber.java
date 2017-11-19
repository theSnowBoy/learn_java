package algorithmTest.basic.easy9_array;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        findThirdQuick(nums, 0, nums.length-1);
        return nums[nums.length - 3];
    }
    public void findThirdQuick(int[]nums,int start,int end){
    	int pStart = start;
    	int pEnd = end;
    	int standard = nums[pStart];
    	while(pStart < pEnd){
    		while(pEnd > pStart && nums[pEnd] >= standard){
    			pEnd --;
    		}
    		if(pEnd > pStart){
    			nums[pStart++] = nums[pEnd];	
    		}
    		
    		while(pEnd > pStart && nums[pStart] <= standard){
    			pStart ++;
    		}
    		if(pEnd > pStart){
    		nums[pEnd--] = nums[pStart];
    		}
    	}
    	int mid = pStart;
    	nums[mid] = standard;
    	if(mid == nums.length -3){
    		return;
    	}else if(mid > nums.length -3){
    		findThirdQuick(nums, start, mid-1);
    	}else{
    		findThirdQuick(nums, mid+1, end);
    	}
    	
    }
}
