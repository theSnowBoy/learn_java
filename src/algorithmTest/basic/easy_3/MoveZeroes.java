package algorithmTest.basic.easy_3;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {

		//先统计，去除，最后填写。
		int count = 0;
		int position = 0;
		for(int i = 0;i < nums.length;i++){
			if( nums[i] == 0  ){
				count ++;
			}else{
				nums[position++] = nums[i];
			}
		}
		//注意i 的初始值设定。
		for(int i = nums.length - count;i < nums.length;i++){
			nums[i] = 0;
		}
	}
}
