package algorithmTest.basic.easy._1;


public class RemoveElement {
	
	/*
	 * ������nums��ɾ��valԪ�ء����ҷ��س��ȣ���ɾ��Ԫ�شӵ�һ����ʼ˳�������š�
	 */
	public int removeElement(int[] nums, int val) {
		//positionλ�õ��趨��Ҫ���ɡ�(һ����)
		//1.positionָ����������µġ�
		//2.position����һ��δʹ�õġ���choose this��
		int position = 0;
		for(int i =0;i <nums.length;i++){
			if(nums[i] != val){
				nums[position++] = nums[i];
			}
		}
		return position;
	}
}
