package algorithmTest.basic.easy9_array;

import java.util.LinkedList;
import java.util.List;

import javax.naming.LinkRef;

public class PascalTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> results = new LinkedList<>();
		results.add(1);
		if (rowIndex == 0) {
			return results;
		}
		results.add(1);
		if (rowIndex == 1) {
			return results;
		}
		for (int i = 2; i <= rowIndex; i++) {
			int front = results.get(0);
			int current;
			for(int j = 1; j < results.size();j++){
				current = results.get(j);
				results.set(j, current + front );
				front = current;
			}
			results.add(1);
		}
		return results;
	}
}
