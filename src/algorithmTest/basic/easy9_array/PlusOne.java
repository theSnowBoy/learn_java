package algorithmTest.basic.easy9_array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> results = new LinkedList();
        int push = 0;
        for(int i = digits.length -1 ; i >=0  ; i--){
        	results.add(0, (push + digits[i] + 1));
        	push =  (push + digits[i] +1) / 10 ;
        }
        if(push == 1){
        	results.add(0, push);
        }
        int[] allResults =  new int[results.size()];
        for(int i = 0; i < allResults.length ; i++){
        	allResults[i] = results.get(i);
        }
        
        return allResults;
    }
}
