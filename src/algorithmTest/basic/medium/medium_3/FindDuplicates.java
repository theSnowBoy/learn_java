package algorithmTest.basic.medium.medium_3;

import java.util.LinkedList;
import java.util.List;

public class FindDuplicates {
	
    public List<Integer> findDuplicates(int[] nums) {
    	
        List<Integer> duplicates = new LinkedList<>();
        int[] results = new int[nums.length + 1 ];
        for(int num : nums){
        	results[num]++;
        }

        for(int i = 1; i <= results.length;i++){
        	if(results[i] == 2){
        		duplicates.add(i);
        	}
        }
        return duplicates;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
