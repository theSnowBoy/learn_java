package algorithmTest.basic.medium.medium_5_backtracking;

import java.beans.Visibility;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
	List<List<Integer>> results = new LinkedList<>();

	public List<List<Integer>> permute(int[] nums) {
		boolean[] visited = new boolean[nums.length];
		LinkedList<Integer> record = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
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
			if (visited[i]) {
				continue;
			}
			find(nums, i, record, visited, count + 1);
		}
		visited[currentIndex] = false;
		record.removeLast();
	}
}
