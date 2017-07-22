package algorithmTest.basic.easy_5;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		
		int pos = 0;
		for( ; pos < nums.length ; pos++){
			if(nums[pos] >= target){
				break;
			}
		}
		return pos;
	}
}
