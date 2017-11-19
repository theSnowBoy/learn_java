package algorithmTest.basic.easy9_array;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int nums2[] = new int[nums.length];
		for(int i = 0;i < nums.length ; i++){
			if(i <= k){
				nums2[nums.length-1-(k-i)]=nums[i];
			}else{
				nums2[i-k-1] = nums[i];
			}
		}
		for(int i = 0 ; i < nums.length;i++){
			nums[i] = nums2[i];
		}
	}
}
