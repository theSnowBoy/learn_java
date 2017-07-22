package algorithmTest.basic.medium;

// TODO not right
public class LeastInterval {

	public int leastInterval(char[] tasks, int n) {
		int interval = 0;
		int typeCount = 0;
		int max_same_task_number = 0;
		int taskIds[] = new int[26];
		for (char task : tasks) {
			taskIds[task - 'A']++;
		}

		for (int i = 0; i < taskIds.length; i++) {
			if (taskIds[i] > 0) {
				typeCount++;
				max_same_task_number = (max_same_task_number < taskIds[i] ? max_same_task_number : taskIds[i]);
			}
		}

		// 转为n > typecount情况
		boolean done = false;
		int countOfOneRound ;
		while (!done) {
			done =true;
			for (int i = 0; i < taskIds.length; i++) {
				if (taskIds[i] > 0) {
					if (--taskIds[i] == 0) {
						
						typeCount--;
						interval++;
					}else{
						done = false;
					}
				}
			}
			
		}
		return interval;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
