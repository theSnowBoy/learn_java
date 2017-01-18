package algorithmTest.basic.easy._1;


public class RemoveElement {
	
	/*
	 * 从数组nums中删除val元素。并且返回长度，非删除元素从第一个开始顺序往后排。
	 */
	public int removeElement(int[] nums, int val) {
		//position位置的设定需要技巧。(一致性)
		//1.position指向最近被更新的。
		//2.position是下一个未使用的。（choose this）
		int position = 0;
		for(int i =0;i <nums.length;i++){
			if(nums[i] != val){
				nums[position++] = nums[i];
			}
		}
		return position;
	}
}
