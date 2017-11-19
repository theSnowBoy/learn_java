package algorithmTest.basic.medium.medium_5_backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

		List<List<Integer>> results = new LinkedList();

		public List<List<Integer>> combinationSum(int[] candidates, int target) {
			// ÅÅĞò
			Arrays.sort(candidates);
			LinkedList<Integer> record = new LinkedList<>();
			// µü´ú
			int pre = -1;
			for (int i = 0; i < candidates.length; i++) {
				if(candidates[i] > target || candidates[i] == pre){
					continue;
				}
				find(candidates, i, target, record);
				pre = candidates[i];
			}
			return results;
		}

		public void find(int[] candidates, int currentIndex, int rest, LinkedList<Integer> record) {

			rest = rest - candidates[currentIndex];

			if (rest == 0) {
				List<Integer> result = new LinkedList<>();
				result.addAll(record);
				result.add(candidates[currentIndex]);
				results.add(result);
				return;
			}

			record.addLast(candidates[currentIndex]);
			int pre = -1;
			for (int i = currentIndex+1; i < candidates.length; i++) {
				if(candidates[i] > rest || candidates[i] == pre){
					continue;
				}
				find(candidates, i, rest, record);
				pre = candidates[i];
			}
			record.removeLast();
		}
	}
