package algorithmTest.basic.easy_3;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {

		//��ͳ�ƣ�ȥ���������д��
		int count = 0;
		int position = 0;
		for(int i = 0;i < nums.length;i++){
			if( nums[i] == 0  ){
				count ++;
			}else{
				nums[position++] = nums[i];
			}
		}
		//ע��i �ĳ�ʼֵ�趨��
		for(int i = nums.length - count;i < nums.length;i++){
			nums[i] = 0;
		}
	}
}
