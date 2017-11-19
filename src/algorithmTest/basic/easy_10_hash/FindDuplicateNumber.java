package algorithmTest.basic.easy_10_hash;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] record = new int[nums.length+1];
        for(int i = 0;i <nums.length;i++){
        	 record[nums[i]]++;
        }
       
        for(int i = 1; i < record.length;i++){
        	if(record[i] > 1){
        		return i;
        	}
        }
        return 0;
    }
}
