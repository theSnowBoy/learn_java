package algorithmTest.basic.easy_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List <Integer> out  = new ArrayList<>();
		Arrays.sort(nums);
		int current = 1;
		for(int i = 0;i<nums.length;){
			if(nums[i] == current){
				current ++;
				i++;
			}else if(nums[i] < current){
				i++;
			}else{
				out.add(current++);
			}
		}
		for(int j = current; j <= nums.length;j++){
			out.add(j);
		}
		return out;
	}
}
