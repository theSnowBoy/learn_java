package algorithmTest.basic.easy_10_hash;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
    	
        int[] record = new int[nums.length+1];
        for(int i = 0 ; i < nums.length ; i++){
        	record[nums[i]] ++;
        }
        
        int[] res = new int[2];
        int p = 0;
        for(int i = 1 ; i < record.length ; i++){
        	if(record[i] == 2){
        		res[0] = i;
        	}else if(record[i] == 0){
        		res[1] = i;
        	}
        }
        return res;
    }
}
