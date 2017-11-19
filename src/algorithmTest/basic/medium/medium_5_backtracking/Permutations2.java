package algorithmTest.basic.medium.medium_5_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations2 {
	List<List<Integer>> results = new ArrayList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {

		// 排序
		Arrays.sort(nums);

		boolean[] visited = new boolean[nums.length];
		LinkedList<Integer> record = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			find(nums, i, record, visited, 1);
		}
		return results;
	}

	public void find(int[] nums, int currentIndex, LinkedList<Integer> record, boolean[] visited, int count) {
		if (count == nums.length) {
			List<Integer> result = new LinkedList<>();
			result.addAll(record);
			result.add(nums[currentIndex]);
			results.add(result);
			return;
		}

		record.addLast(nums[currentIndex]);
		visited[currentIndex] = true;
		
		for (int i = 0; i < nums.length; i++) {
			//没有被访问过
			if (!visited[i]) {
				// 经过前面的排序，i = 0肯定没有之前其数据被访问过。
				//（相同值）相邻的，其之前的未被处理过，肯定在上次循环中已经处理过了（所以本次不处理）。
				if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;			
					find(nums, i, record, visited, count + 1);				
			}
		}
		visited[currentIndex] = false;
		record.removeLast();
	}
	public static void main(String[] args) {
		Permutations2 p2 = new Permutations2();
		int[] nums = new int[3];
		nums[0] =1;
		nums[1] = 1;
		nums[2] = 2;
		p2.permuteUnique(nums);
	}
}
