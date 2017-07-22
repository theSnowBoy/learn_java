package algorithmTest.basic.divideCon;

public class MaximumSubarray {public class Solution {
//wrong!!!
	public int maxSubArray(int[] nums) {
		if(nums == null||nums.length ==0) return 0;
		return maxSubArray(nums,0,nums.length-1);
	}
	
	public int maxSubArray(int[] nums,int start,int end){
		if(start >= end) return nums[start];
		int middle = (start + end )/2;
		int l = maxSubArray(nums, start, middle);
		int r = maxSubArray(nums, middle, end);
		int m = nums[middle];
		int max_m = m;
		int i,j;
		//Ì°ĞÄ
		for(i = middle+1,j=middle-1;i<nums.length && j >= 0;){
			if(nums[i] > nums[j]){
				 m += nums[i++];
				 max_m = max_m >= m ? max_m:m;
			}else{
				 m += nums[j++];
				 max_m = max_m >= m ? max_m:m;
			}
		}
		if(i < nums.length){
			for(;i<nums.length;i++){
				m += nums[i];
				 max_m = max_m >= m ? max_m:m;
			}
		}
		if(j >= 0){
			for(;j>=0;j--){
				 m += nums[j];
				 max_m = max_m >= m ? max_m:m;
			}
		}
		
		return Math.max(Math.max(l, r), max_m);
	}

}}
