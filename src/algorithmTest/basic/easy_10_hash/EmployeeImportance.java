package algorithmTest.basic.easy_10_hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EmployeeImportance {
	public int getImportance(List<Employee> employees, int id) {
		if (employees == null || employees.size() == 0) {
			return 0;
		}
		
		int result = 0;
		Queue<Integer> que = new LinkedList<>();
		que.add(id);
		while (!que.isEmpty()) {
			int current = que.poll();
			for (Employee em : employees) {
				if (em.id == current) {
					result += em.importance;
					for(Integer sub : em.subordinates){
						que.add(sub);
					}
					break;
				}
			}
		}
		return result;
	}

	class Employee {
		// It's the unique id of each node;
		// unique id of this employee
		public int id;
		// the importance value of this employee
		public int importance;
		// the id of direct subordinates
		public List<Integer> subordinates;
	};
}
