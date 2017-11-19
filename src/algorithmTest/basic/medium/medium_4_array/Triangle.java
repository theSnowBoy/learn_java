package algorithmTest.basic.medium.medium_4_array;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0){
        	return 0;
        }
        int rows = triangle.size();
        for(int i = rows -1; i > 0 ;i++){
        	List<Integer> upRow = triangle.get(i+1);
        	List<Integer> downRow = triangle.get(i);
        	for(int j = 0; j < upRow.size() ; j++){
        		upRow.set(j,upRow.get(j) + (downRow.get(i) < downRow.get(i+1)?downRow.get(i):downRow.get(i+1)));
        	}
        }
        return triangle.get(0).get(0);
    }
}
