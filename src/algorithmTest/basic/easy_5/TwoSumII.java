package algorithmTest.basic.easy_5;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
    	
        int sum = 0;
        int i=0,j=numbers.length-1;
    	while(i<j){
    		sum = numbers[i] + numbers[j];
    		if(target == sum){
    			break;
    		}else if(target < sum){
    			j--;
    		}else{
    			i++;
    		}
    	}
    	int[] results = new int[2];
    	results[0] = i + 1;
    	results[1] = j + 1;
    	return results;
    }
}
